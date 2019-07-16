/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.model.dao;

import br.com.ap220191.ec08_locacao_veiculos.model.Motorista;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuLocacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class MotoristaDAO {
    
    private final Connection connection;

    public MotoristaDAO(Connection connection) {
        this.connection = connection;
    }

 
    public void insert(Motorista motorista) throws SQLException {

        try{     
        String sql = "insert into motorista (nome, matricula, tempoempresa, habilitacao, disponibilidade) values ('"+motorista.getNome()+"','"+motorista.getMatricula()+"'"+ ",'"+motorista.getTempoEmpresa()+"', '"+motorista.getHabilitacao()+"', true)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " +ex);
        }
    }
    public void update(Motorista motorista) throws SQLException {
        try{     
        String sql = "UPDATE motorista SET disponibilidade = false WHERE nome = '"+motorista.getNome()+"')";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute(sql);            
        }catch(SQLException ex){            
        }
    }



    public ResultSet procurarMotorista(Motorista motorista) throws SQLException {
        String sql = "select * from motorista where nome = '"+motorista.getNome()+"' ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();      
        ResultSet resulSet = statement.executeQuery();    
        return resulSet;  
    }
    
    public ResultSet comboBoxMotoristas() throws SQLException {
        String sql = "select * from motorista";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();      
        ResultSet resulSet = statement.executeQuery();    
        return resulSet;  
    }
    
    public List<Motorista> listarMotoristas(MenuLocacao view) throws SQLException{
        String sql = "select * from motorista";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();

        List<Motorista> motoristas = new ArrayList<Motorista>();

        while (rs.next()) {

            Motorista motorista = new Motorista();
            motorista.setHabilitacao(rs.getString("habilitacao"));
            motorista.setNome(rs.getString("nome"));
            motorista.setMatricula(rs.getString("matricula"));
            motorista.setTempoEmpresa(rs.getString("tempoempresa"));
            motorista.setDisponibilidadeMotorista(rs.getString("disponibilidade"));
            motoristas.add(motorista);
            
            
        }

        rs.close();
        statement.close();

        return motoristas;
    }
    
    
    
    
    
}
