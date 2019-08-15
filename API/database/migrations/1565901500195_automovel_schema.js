'use strict'

/** @type {import('@adonisjs/lucid/src/Schema')} */
const Schema = use('Schema')

class AutomovelSchema extends Schema {
  up () {
    this.create('automovels', table => {
      table.increments()
      table
        .string('placa', 7)
        .notNullable()
        .unique()
      table.float('valorDiaria', [2]).notNullable()
      table.boolean('disponibilidade').notNullable()
      table.float('aliquota', [2]).notNullable()
      table.timestamps()
    })
  }

  down () {
    this.drop('automovels')
  }
}

module.exports = AutomovelSchema
