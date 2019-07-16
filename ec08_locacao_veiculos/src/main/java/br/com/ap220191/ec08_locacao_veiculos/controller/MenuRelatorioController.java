
package br.com.ap220191.ec08_locacao_veiculos.controller;

import br.com.ap220191.ec08_locacao_veiculos.model.Locacao;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.Conexao;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.LocacaoDAO;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuRelatorio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MenuRelatorioController {
    
     private MenuRelatorio view;

    public MenuRelatorioController(MenuRelatorio view) {
        this.view = view;
    }
    
    public void imprimirRelatorio() throws SQLException {

        Connection conexao = new Conexao().getConnection();
        LocacaoDAO locacaoDao = new LocacaoDAO(conexao);
        String dataInicial = view.getjFormattedTextFieldDataInicial().getText();
        String dataFinal = view.getjFormattedTextFieldDataFinal().getText();
        Locacao locacaoVerificar = new Locacao(dataInicial, dataFinal);
        ResultSet rs = locacaoDao.existeRelatorio(locacaoVerificar);

        while(rs.next()) {           
                view.getjTextAreaRelatorio().append("\n\n -----------------------------------");
                view.getjTextAreaRelatorio().append("\n | Cpf do Cliente: " + rs.getString("cpf"));               
                view.getjTextAreaRelatorio().append("\n | Placa do veículo: " + rs.getString("placa"));
                view.getjTextAreaRelatorio().append("\n | Tipo do veículo: " + rs.getString("tipo"));
                view.getjTextAreaRelatorio().append("\n | Valor Diária: " + rs.getString("valordiaria"));
                view.getjTextAreaRelatorio().append("\n | Valor Klometragem: " + rs.getString("valorkilometragem"));
                view.getjTextAreaRelatorio().append("\n | Nome do Motorista: " + rs.getString("motorista"));            
                view.getjTextAreaRelatorio().append("\n -----------------------------------");
            }
            
        } 

    }
    

