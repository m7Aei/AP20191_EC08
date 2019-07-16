package br.com.ap220191.ec08_locacao_veiculos.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Automovel {

    private String placa;
    private boolean disponibilidade;


    private TipoAutomovel tipo;

   

    public Automovel(String placa, boolean disponibilidade, TipoAutomovel tipo) {
        this.placa = placa;
        this.disponibilidade = disponibilidade;
        this.tipo = tipo;
    }
    
    
    

    public TipoAutomovel getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovel tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

   

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void cadastrarAutomovel(String placa) {
        setPlaca(this.placa);

    }

    public void removerAutomovel() {

    }

    public void editarAutomovel() {

    }

}
