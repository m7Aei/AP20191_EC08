package br.com.ap220191.ec08_locacao_veiculos.controller;

import br.com.ap220191.ec08_locacao_veiculos.model.Motorista;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.Conexao;
import br.com.ap220191.ec08_locacao_veiculos.model.dao.MotoristaDAO;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuCadastroMotoristas;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gattc
 */
public class MenuCadastroMotoristaController {

    private MenuCadastroMotoristas view;

    public MenuCadastroMotoristaController(MenuCadastroMotoristas view) {
        this.view = view;
    }

    public void salvarMotorista() {

//        Motorista motorista = new Motorista(view.getjTextFieldNomeMotorista().getText(), view.getjTextFieldMatriculaMotorista().getText(), view.getjComboBoxTipoHabilitacao(), view.getjTextFieldTempoMotorista().getText());

        try {
            Connection conexao = new Conexao().getConnection();
            MotoristaDAO motoristaDao = new MotoristaDAO(conexao);
//            motoristaDao.insert(motorista);
        } catch (SQLException ex) {
            Logger.getLogger(MenuCadastroMotoristas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
