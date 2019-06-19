package br.com.ap220191.ec08_locacao_veiculos.controller;

import br.com.ap220191.ec08_locacao_veiculos.controller.helper.MenuLoginHelper;
import br.com.ap220191.ec08_locacao_veiculos.model.Cliente;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuLogin;

public class MenuLoginController {
    private final MenuLogin view;
    private final MenuLoginHelper helper;

    public MenuLoginController(MenuLogin view) {
        this.view = view;
        this.helper = new MenuLoginHelper(view);
    }
    public void entrarNoSistema(){
        Cliente cliente = helper.obterModelo();
        
    }
}
