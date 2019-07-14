/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.model.dao;

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

public class MotoristaDAO {
    
    private final Connection connection;

    public MotoristaDAO(Connection connection) {
        this.connection = connection;
    }

 
    public void insert(Motorista motorista) throws SQLException {

        try{     
        String sql = "insert into motorista (nome, matricula, tempoempresa, habilitacao) values ('"+motorista.getNome()+"','"+motorista.getMatricula()+"','"+motorista.getTempoEmpresa()+"', '"+motorista.getHabilitacao()+"')";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " +ex);
        }
    }



    public boolean procurarMotorista(Motorista motorista) throws SQLException {
        String sql = "select * from motorista where matricula = '"+motorista.getMatricula()+"' and nome = '"+motorista.getNome()+"' ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        ResultSet resulSet = statement.getResultSet();    
        return resulSet.next();      
    }
    
}
