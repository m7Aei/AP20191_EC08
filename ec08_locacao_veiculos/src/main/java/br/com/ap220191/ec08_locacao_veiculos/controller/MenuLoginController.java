package br.com.ap220191.ec08_locacao_veiculos.controller;

import br.com.ap220191.ec08_locacao_veiculos.model.Administrador;
import br.com.ap220191.ec08_locacao_veiculos.model.Cliente;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.ClienteDAO;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.Conexao;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuAdministrador;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuCliente;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuLogin;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MenuLoginController {

    private MenuLogin view;

    public MenuLoginController(MenuLogin view) {
        this.view = view;
    }

    Administrador admin = new Administrador("admin", "1234");

    public void autenticarUsuario() throws SQLException {
        String usuario = view.getNomeUsuario().getText();
        String senha = view.getSenhaUsuario().getText();
        
        Cliente usuarioAutenticar = new Cliente(usuario, senha);
        Connection conexao = new Conexao().getConnection();
        ClienteDAO usuarioDao = new ClienteDAO(conexao);     
        
        boolean existe = usuarioDao.existeUsuario(usuarioAutenticar);
        if (existe) {
            MenuCliente menu = new MenuCliente();
            menu.setVisible(true);
            view.dispose();
        } else {
            if (usuario.equals(admin.getUsuario()) && senha.equals(admin.getSenha())) {
                MenuAdministrador menu = new MenuAdministrador();
                menu.setVisible(true);
                view.dispose();
            }

        }

    }

  

    
}
