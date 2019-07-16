/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.model;

/**
 *
 * @author Natalie
 */
public enum TipoAutomovel {
     UTILITARIO(15.0), 
     LUXO(10.0), 
     SIMPLES(0.0), 
     SUPERLUXO(20.0);
     
     private Double Aliquota; 

    public Double getAliquota() {
        return Aliquota;
    }

    public void setAliquota(Double Aliquota) {
        this.Aliquota = Aliquota;
    }

    private TipoAutomovel(Double Aliquota) {
        this.Aliquota = Aliquota;
    }
}

