'use strict'

/** @type {import('@adonisjs/lucid/src/Schema')} */
const Schema = use('Schema')

class TipoAutomovelSchema extends Schema {
  up () {
    this.create('tipo_automovels', (table) => {
      table.increments()
      table.integer('utilitario').notNullable()
      table.integer('simples').notNullable()
      table.integer('luxo').notNullable()
      table.integer('superluxo').notNullable()
      table.timestamps()
    })
  }

  down () {
    this.drop('tipo_automovels')
  }
}

module.exports = TipoAutomovelSchema
