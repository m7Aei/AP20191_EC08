/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.controller;

import br.com.ap220191.ec08_locacao_veiculos.model.Automovel;
import br.com.ap220191.ec08_locacao_veiculos.model.Locacao;
import br.com.ap220191.ec08_locacao_veiculos.model.Motorista;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.AutomovelDAO;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.Conexao;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.LocacaoDAO;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.MotoristaDAO;
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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author T-Gamer
 */
public class MenuLocacaoController {

    private MenuLocacao view;

    public MenuLocacaoController(MenuLocacao view) {
        this.view = view;
    }

    

    public void salvarLocacao() {

        Locacao data = new Locacao();
        Locacao locacao = new Locacao(view.getjFormattedTextFieldCpfLocacao().getText(), view.getjComboBoxMotorista(), view.getjComboBoxVeiculo(), data.dataAtual(), view.getjFormattedTextFieldPrazoLocacao().getText(), view.getjTextFieldPlaca().getText(),view.getjComboBoxValorDiaria(),view.getjComboBoxValorKilometragem());

        try {
            Connection conexao = new Conexao().getConnection();
            LocacaoDAO locacaoDao = new LocacaoDAO(conexao);
            locacaoDao.insert(locacao);
        } catch (SQLException ex) {
            Logger.getLogger(MenuLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void validarMotorista() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        MotoristaDAO motoristaDao = new MotoristaDAO(conexao);
        String motoristaNome = view.getjComboBoxMotorista();
        Motorista motoristaVerificar = new Motorista();
        motoristaVerificar.setNome(motoristaNome);
        ResultSet rs = motoristaDao.procurarMotorista(motoristaVerificar);

        if (rs.next()) {
            Motorista motorista = new Motorista();
            motorista.setHabilitacao(rs.getString("habilitacao"));
            motorista.setNome(rs.getString("nome"));
            motorista.setMatricula(rs.getString("matricula"));
            motorista.setTempoEmpresa(rs.getString("tempoempresa"));
            motorista.setDisponibilidadeMotorista(rs.getString("disponibilidade"));

        } else {
            JOptionPane.showMessageDialog(null, "Motorista não encontrado");
        }

    }

    public String validarHabilitacao() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        MotoristaDAO motoristaDao = new MotoristaDAO(conexao);
        String motoristaNome = view.getjComboBoxMotorista();
        Motorista motoristaVerificar = new Motorista();
        motoristaVerificar.setNome(motoristaNome);
        ResultSet rs = motoristaDao.procurarMotorista(motoristaVerificar);

        if (rs.next()) {
            Motorista motorista = new Motorista();
            motorista.setHabilitacao(rs.getString("habilitacao"));
            return motorista.getHabilitacao();

        } else {
            return "";

        }

    }

    public String validarDisponibilidadeMotorista() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        MotoristaDAO motoristaDao = new MotoristaDAO(conexao);
        String motoristaNome = view.getjComboBoxMotorista();
        Motorista motoristaVerificar = new Motorista();
        motoristaVerificar.setNome(motoristaNome);
        ResultSet rs = motoristaDao.procurarMotorista(motoristaVerificar);

        if (rs.next()) {
            Motorista motorista = new Motorista();
            motorista.setDisponibilidadeMotorista(rs.getString("disponibilidade"));
            return motorista.getDisponibilidadeMotorista();

        } else {
            return "";

        }
    }

    public String validarTipoVeiculo() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        AutomovelDAO automovelDao = new AutomovelDAO(conexao);
        String automovelTipo = view.getjComboBoxVeiculo();
        Automovel automovelVerificar = new Automovel();
        automovelVerificar.setTipo(automovelTipo);
        ResultSet rs = automovelDao.existeAutomovel(automovelVerificar);

        if (rs.next()) {
            Automovel automovel = new Automovel();
            automovel.setTipo(rs.getString("tipo"));
            return automovel.getTipo();
        } else {
            return "";
        }

    }

    public String validarDisponibilidadeVeiculo() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        AutomovelDAO automovelDao = new AutomovelDAO(conexao);
        String automovelTipo = view.getjComboBoxVeiculo();
        Automovel automovelVerificar = new Automovel();
        automovelVerificar.setTipo(automovelTipo);
        ResultSet rs = automovelDao.existeAutomovel(automovelVerificar);

        if (rs.next()) {
            Automovel automovel = new Automovel();
            automovel.setDisponibilidade(rs.getString("disponibilidade"));
            return automovel.getDisponibilidade();
        } else {
            return "";
        }
    }

    public void alterarDisponibilidadeVeiculo() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        AutomovelDAO automovelDao = new AutomovelDAO(conexao);
        String automovelTipo = view.getjComboBoxVeiculo();
        Automovel automovelAtualizar = new Automovel();
        automovelAtualizar.setTipo(automovelTipo);
        automovelDao.update(automovelAtualizar);
        

    }
    
    public void alterarDisponibilidadeMotorista() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        MotoristaDAO motoristaDao = new MotoristaDAO(conexao);
        String motoristaNome = view.getjComboBoxMotorista();
        Motorista motoristaVerificar = new Motorista();
        motoristaVerificar.setNome(motoristaNome);
        motoristaDao.update(motoristaVerificar);

        
    }
    
    
    
}
