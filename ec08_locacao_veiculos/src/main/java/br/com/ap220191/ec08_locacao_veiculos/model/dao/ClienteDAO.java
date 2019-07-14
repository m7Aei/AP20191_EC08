/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.model.dao;

import br.com.ap220191.ec08_locacao_veiculos.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO {

    private final Connection connection;

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Cliente cliente) throws SQLException {

        try {
            String sql = "insert into cliente (nome, cpf, usuario, senha, serasa, inadiplente) values ('" + cliente.getNome() + "','" + cliente.getCpf() + "','" + cliente.getUsuario() + "', '" + cliente.getSenha() + "',false, false)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }

    }

    public boolean existeUsuario(Cliente cliente) throws SQLException {
        String sql = "select * from cliente where usuario = '" + cliente.getUsuario() + "' and senha = '" + cliente.getSenha() + "' ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        ResultSet resulSet = statement.getResultSet();
        return resulSet.next();

    }

}
