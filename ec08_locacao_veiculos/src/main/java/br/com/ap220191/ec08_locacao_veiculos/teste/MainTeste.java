/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.teste;

import br.com.ap220191.ec08_locacao_veiculos.model.Automovel;
import br.com.ap220191.ec08_locacao_veiculos.model.Cliente;
import br.com.ap220191.ec08_locacao_veiculos.model.Motorista;
import br.com.ap220191.ec08_locacao_veiculos.model.TipoAutomovel;

/**
 *
 * @author Natalie
 */
public class MainTeste {
    
    public static void main(String args[]){
        Cliente cliente = new Cliente("João", "12345678910", false, false, null);
        
        Motorista motorista = new Motorista("José", "5437A", "D", 5.0);
        
        Automovel a1 = new Automovel("123ABC", true, TipoAutomovel.LUXO);
        
        System.out.println(a1.getTipo().getAliquota());
                       
    }
    
    
}
