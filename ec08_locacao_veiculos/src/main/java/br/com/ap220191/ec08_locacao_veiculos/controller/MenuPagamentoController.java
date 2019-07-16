/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.controller;

import br.com.ap220191.ec08_locacao_veiculos.model.Automovel;
import br.com.ap220191.ec08_locacao_veiculos.model.Locacao;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.ClienteDAO;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.Conexao;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.LocacaoDAO;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuPagamento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author T-Gamer
 */
public class MenuPagamentoController {

    private MenuPagamento view;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    SimpleDateFormat dia = new SimpleDateFormat("dd");
    SimpleDateFormat mes = new SimpleDateFormat("MM");
    SimpleDateFormat ano = new SimpleDateFormat("yy");

    public MenuPagamentoController(MenuPagamento view) {
        this.view = view;
    }

    public double calcularValor() throws SQLException, ParseException {
        Connection conexao = new Conexao().getConnection();
        LocacaoDAO locacaoDao = new LocacaoDAO(conexao);    
        String cpf = view.getjFormattedTextFieldCpf().getText();       
        Locacao locacaoVerificar = new Locacao(cpf);       
        ResultSet rs = locacaoDao.existeLocacao(locacaoVerificar);
       
        if(rs.next()){
            Locacao locacao = new Locacao();
            locacao.setCpfCliente(rs.getString("cpf"));
            locacao.setDataDevolucao(rs.getString("datadevolucao"));
            locacao.setDataLocacao(rs.getString("datalocacao"));           
            locacao.setNomeMotorista(rs.getString("motorista"));
            locacao.setPlaca(rs.getString("placa"));
            locacao.setNomeMotorista(rs.getString("motorista"));
            locacao.setValorDiaria(rs.getString("valordiaria"));
            locacao.setValorQuilometragem(rs.getString("valorkilometragem"));
            locacao.setTipoAutomovel(rs.getString("tipo"));
     
         int dias, meses, anos;
        Date data1 = null, data2 = null;
        data1 = sdf.parse(locacao.getDataLocacao());
        try {
            data2 = sdf.parse(locacao.getDataDevolucao());
        } catch (ParseException ex) {
            Logger.getLogger(MenuPagamentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        int dl = Integer.parseInt(dia.format(data1));
        int dd = Integer.parseInt(dia.format(data2));
        int ml = Integer.parseInt(mes.format(data1));
        int md = Integer.parseInt(mes.format(data2));
        int al = Integer.parseInt(ano.format(data1));
        int ad = Integer.parseInt(ano.format(data2));
        if (dd >= dl) {
            dias = dd - dl;
        } else {
            dias = (30 + dd) - dl;
            md = md--;
        }
        if (md >= ml) {
            meses = md - ml;
        } else {
            meses = (12 + md) - ml;
            ad = ad--;
        }
        anos = ad - al;
        double diasTotais = (360 * anos) + (12 * meses) + dias;
        
        double valorDiaria = Double.parseDouble(locacao.getValorDiaria());
        double valorKilometragem = Double.parseDouble(locacao.getValorQuilometragem());
        double kilometrosRodados = Double.parseDouble(view.getjTextFieldQuilometragemRodada().getText());

        
        if(locacao.getTipoAutomovel().equals("Luxo")){
            return ((diasTotais * valorDiaria) + valorKilometragem * kilometrosRodados)*1.15;
        }else if(locacao.getTipoAutomovel().equals("Super-Luxo")){
            return ((diasTotais * valorDiaria) + valorKilometragem * kilometrosRodados)*1.20;
        }else if(locacao.getTipoAutomovel().equals("Utilitário")){
            return ((diasTotais * valorDiaria) + valorKilometragem * kilometrosRodados)*0.85;
        }
        else{
            return (diasTotais * valorDiaria) + valorKilometragem * kilometrosRodados;
        }
           
        
        }
        return 0;
        
    }
}
