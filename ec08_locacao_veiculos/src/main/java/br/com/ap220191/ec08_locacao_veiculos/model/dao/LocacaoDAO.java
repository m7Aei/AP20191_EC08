/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.model.dao;


import br.com.ap220191.ec08_locacao_veiculos.model.Locacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LocacaoDAO {
    
    private final Connection connection;

    public LocacaoDAO(Connection connection) {
        this.connection = connection;
    }

   
    
}
