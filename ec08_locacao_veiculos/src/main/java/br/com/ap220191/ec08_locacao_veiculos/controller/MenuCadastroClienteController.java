/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.controller;

import br.com.ap220191.ec08_locacao_veiculos.model.Cliente;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.ClienteDAO;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.Conexao;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuCadastroCliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-Gamer
 */
public class MenuCadastroClienteController {
    private MenuCadastroCliente view;

    public MenuCadastroClienteController(MenuCadastroCliente view) {
        this.view = view;
    }
    
    public void salvarCliente(){
        
        Cliente cliente = new Cliente(view.getjTextFieldNomeCliente().getText(),view.getjTextFieldUsuarioCliete().getText(),view.getjTextFieldSenhaCliente().getText(),view.getjFormattedTextFieldCpf().getText(),false,false);
        
        
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clienteDao = new ClienteDAO(conexao);
            clienteDao.insert(cliente);         
        } catch (SQLException ex) {
            Logger.getLogger(MenuCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
