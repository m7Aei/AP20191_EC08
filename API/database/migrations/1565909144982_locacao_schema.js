'use strict'

/** @type {import('@adonisjs/lucid/src/Schema')} */
const Schema = use('Schema')

class LocacaoSchema extends Schema {
  up () {
    this.create('locacaos', table => {
      table.increments()
      table
        .integer('user_id')
        .unsigned()
        .references('id')
        .inTable('users')
      table
        .integer('motorista_id')
        .unsigned()
        .references('id')
        .inTable('motoristas')
      table
        .integer('automovel_id')
        .unsigned()
        .references('automovels')
        .inTable('motoristas')
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
