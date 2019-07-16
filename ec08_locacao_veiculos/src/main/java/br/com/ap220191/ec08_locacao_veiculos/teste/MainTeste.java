/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.teste;

import br.com.ap220191.ec08_locacao_veiculos.model.Automovel;
import br.com.ap220191.ec08_locacao_veiculos.model.Cliente;
import br.com.ap220191.ec08_locacao_veiculos.model.Locacao;
import br.com.ap220191.ec08_locacao_veiculos.model.Motorista;
import br.com.ap220191.ec08_locacao_veiculos.model.TipoAutomovel;

/**
 *
 * @author Natalie
 */
public class MainTeste {
    //testa Classes em memoria
    public static void main(String args[]){
        Cliente cliente1 = new Cliente("João", "12345678910");
        Cliente cliente2 = new Cliente("Maria", "12345678910");
        Cliente cliente3 = new Cliente("José", "12345678910");
        Cliente cliente4 = new Cliente("Lara", "12345678910");

        System.out.println(Cliente.clientes.size() + " "+Cliente.clientes.get(1).getNome());
                       
    }
    
    
}
