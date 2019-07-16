/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.controller;

import br.com.ap220191.ec08_locacao_veiculos.model.Automovel;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.AutomovelDAO;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.Conexao;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuCadastroVeiculos;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuCadastroAutomovelController {
      private MenuCadastroVeiculos view;

    public MenuCadastroAutomovelController(MenuCadastroVeiculos view) {
        this.view = view;
    }

    public void salvarAutomovel() {

        Automovel automovel = new Automovel(view.getjTextFieldPlaca().getText(),view.getjComboBoxTipoVeículo());

        try {
            Connection conexao = new Conexao().getConnection();
            AutomovelDAO automovelDao = new AutomovelDAO(conexao);
            automovelDao.insert(automovel);
        } catch (SQLException ex) {
            Logger.getLogger(MenuCadastroVeiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
