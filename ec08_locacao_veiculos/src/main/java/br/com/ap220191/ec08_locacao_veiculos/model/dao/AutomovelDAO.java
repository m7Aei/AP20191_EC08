/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.model.dao;

import br.com.ap220191.ec08_locacao_veiculos.model.Automovel;
import br.com.ap220191.ec08_locacao_veiculos.model.Motorista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gattc
 */
public class AutomovelDAO {
    private final Connection connection;

    public AutomovelDAO(Connection connection) {
        this.connection = connection;
    }

 
    public void insert(Automovel automovel) throws SQLException {

        try{     
        String sql = "insert into veiculos (placa,disponibilidade,tipo) values ('"+automovel.getPlaca()+"',true ,'"+automovel.getTipo()+"')";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " +ex);
        }
    }




    
}
