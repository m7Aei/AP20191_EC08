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

        Motorista motorista = new Motorista("Jos�", "5437A", "D", 5.0);
        Cliente cliente = new Cliente("Jo�o", "12345678910");
        Automovel a1 = new Automovel("123ABC", true, TipoAutomovel.UTILITARIO);
        a1.setQuilometragem(120000.);
        Locacao.verificaInadinplencia(cliente);
        Locacao.verificarHabilitacao(a1,motorista);
        Locacao loc = new Locacao(dataLoc,dataDev, cliente, motorista, a1);
        System.out.println("tempo locado: "+loc.calcularData()+"Quilometragem Inicial: "+loc.getQuilometragemLocacao());
        //System.out.println(a1.getTipo().getAliquota());
                       
    }
    
    
}
