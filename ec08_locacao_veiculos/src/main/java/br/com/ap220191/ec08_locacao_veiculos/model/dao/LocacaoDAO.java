/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.model.dao;


import br.com.ap220191.ec08_locacao_veiculos.model.Automovel;
import br.com.ap220191.ec08_locacao_veiculos.model.Locacao;
import br.com.ap220191.ec08_locacao_veiculos.model.Motorista;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuBuscarCliente;
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

public class LocacaoDAO {
    
    private final Connection connection;

    public LocacaoDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Locacao locacao) throws SQLException {

        try {
            String sql = "insert into locacao (datalocacao, datadevolucao, motorista, placa, cpf, pagamento,valordiaria,valorkilometragem, tipo) values ('" + locacao.getDataLocacao()+ "','" + locacao.getDataDevolucao()+ "','" + locacao.getNomeMotorista()+"', '" + locacao.getPlaca()+ "','"+ locacao.getCpfCliente()+ "','false','" + locacao.getValorDiaria()+"','" + locacao.getValorQuilometragem()+"','" + locacao.getTipoAutomovel()+"')";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }

    }
    
    
    
    
    public ResultSet existeLocacao(Locacao locacao) throws SQLException {
        
        String sql = "select * from locacao where cpf = '"+locacao.getCpfCliente()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();      
        ResultSet resulSet = statement.executeQuery();    
        return resulSet;      
    }
    
    public ResultSet existeRelatorio(Locacao locacao) throws SQLException {
        
        String sql = "select * from locacao where datalocacao = '" + locacao.getDataLocacao()+"' and datadevolucao = '"+locacao.getDataDevolucao()+"' ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();      
        ResultSet resulSet = statement.executeQuery();    
        return resulSet;      
    } 
    }
    
    
    
    
    

    

