'use strict'

/** @type {import('@adonisjs/lucid/src/Schema')} */
const Schema = use('Schema')

class NotaFiscalSchema extends Schema {
  up () {
    this.create('nota_fiscals', table => {
      table.increments()
      table.date('data')
      table
        .integer('user_id')
        .unsigned()
        .references('id')
        .inTable('users')
      table
        .integer('automovels_id')
        .unsigned()
        .references('id')
        .inTable('automovels')
      table.timestamps()
    })
  }

  down () {
    this.drop('nota_fiscals')
  }
}

module.exports = NotaFiscalSchema
