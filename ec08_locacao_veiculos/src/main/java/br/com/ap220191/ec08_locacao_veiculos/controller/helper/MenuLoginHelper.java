package br.com.ap220191.ec08_locacao_veiculos.controller.helper;
import br.com.ap220191.ec08_locacao_veiculos.model.Cliente;
import br.com.ap220191.ec08_locacao_veiculos.view.MenuLogin;
public class MenuLoginHelper {
    
    private final MenuLogin view;
    
    public MenuLoginHelper(MenuLogin view) {
        this.view = view;
        
    }
    public Cliente obterModelo(){
    String usuario = view.getNomeUsuario().getText();
    String senha = view.getSenhaUsuario().getText();
    
    Cliente cliente = new Cliente(usuario, senha);
       return cliente;
    }
}
