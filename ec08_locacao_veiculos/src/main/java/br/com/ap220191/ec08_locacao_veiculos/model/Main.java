/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.model;

import br.com.ap220191.ec08_locacao_veiculos.controller.MenuLocacaoController;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuLocacao;
import java.sql.SQLException;
import java.text.DateFormat;
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
public class Main {
    private MenuLocacaoController controller;
    private MenuLocacao view;
    
    public static void main(String[] args) throws SQLException {
        
        
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    String dataAtualString = dateFormat.format(date);
    System.out.println(dataAtualString.replace("/", ""));
    
   
}
}
