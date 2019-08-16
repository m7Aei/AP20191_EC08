'use strict'

/** @type {import('@adonisjs/lucid/src/Schema')} */
const Schema = use('Schema')

class MotoristaSchema extends Schema {
  up () {
    this.create('motoristas', table => {
      table.increments()
      table
        .integer('automovel_id')
        .unsigned()
        .references('id')
        .inTable('automovels')
      table.string('nome', 255).notNullable()
      table
        .string('matricula', 255)
        .notNullable()
        .unique()
      table
        .string('cnh', 12)
        .notNullable()
        .unique()
      table.integer('tempoEmpresa').notNullable()
      table.timestamps()
    })
  }

  down () {
    this.drop('motoristas')
  }
}

module.exports = MotoristaSchema
