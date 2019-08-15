'use strict'

/** @type {import('@adonisjs/lucid/src/Schema')} */
const Schema = use('Schema')

class LocacaoSchema extends Schema {
  up () {
    this.create('locacaos', table => {
      table.increments()
      table.date('dataLocacao').notNullable()
      table.date('dataDevolucao').notNullable()
      table.float('kmLocacao', [2]).notNullable()
      table.float('kmDevolucao', [2]).notNullable()
      table.timestamps()
    })
  }

  down () {
    this.drop('locacaos')
  }
}

module.exports = LocacaoSchema
