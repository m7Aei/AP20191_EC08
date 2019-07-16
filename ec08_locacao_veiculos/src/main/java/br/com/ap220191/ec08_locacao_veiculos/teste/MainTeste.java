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
    
    public static void main(String args[]){
        String dataLoc, dataDev; 
        dataLoc="12/05/2019"; 
        dataDev="20/06/2019"; 
        
        String tipoVeiculo = "LUXO"; //pegar valor no select 
        
        Motorista motorista = new Motorista("José", "5437A", "D", 5.0);
        
        Cliente cliente = new Cliente("João", "12345678910", false, false, motorista);
        
        Automovel a1 = new Automovel("123ABC", true, TipoAutomovel.UTILITARIO);
        
        
        Locacao loc = new Locacao(dataLoc,dataDev , 120.0, cliente, motorista, a1, true);
        
        loc.realizarLocacao(cliente, a1);
        loc.realizarDevolucao(200.0); //km final do carro
        System.out.println(loc.calcularData());
        //System.out.println(a1.getTipo().getAliquota());
                       
    }
    
    
}
