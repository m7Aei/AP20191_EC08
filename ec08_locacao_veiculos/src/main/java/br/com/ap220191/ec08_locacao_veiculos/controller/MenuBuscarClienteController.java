package br.com.ap220191.ec08_locacao_veiculos.controller;

import br.com.ap220191.ec08_locacao_veiculos.model.Locacao;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.Conexao;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.LocacaoDAO;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuBuscarCliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MenuBuscarClienteController {

    private MenuBuscarCliente view;

    public MenuBuscarClienteController(MenuBuscarCliente view) {
        this.view = view;
    }
  
    
    public void buscarCliente() throws SQLException {

        Connection conexao = new Conexao().getConnection();
        LocacaoDAO locacaoDao = new LocacaoDAO(conexao);
        String cpf = view.getjFormattedTextFieldCpf().getText();
        Locacao locacaoVerificar = new Locacao(cpf);
        ResultSet rs = locacaoDao.existeLocacao(locacaoVerificar);

        while(rs.next()) {           
                view.getjTextAreaLocacoes().append("\n\n -----------------------------------");
                view.getjTextAreaLocacoes().append("\n Placa do veículo: " + rs.getString("placa"));
                view.getjTextAreaLocacoes().append("\n Tipo do veículo: " + rs.getString("tipo"));
                view.getjTextAreaLocacoes().append("\n Data de locação: " + rs.getString("datalocacao"));
                view.getjTextAreaLocacoes().append("\n Motorista: " + rs.getString("motorista"));
                view.getjTextAreaLocacoes().append("\n -----------------------------------");
            }
            
        }

}
