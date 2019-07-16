package br.com.ap220191.ec08_locacao_veiculos.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Automovel {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat dia = new SimpleDateFormat("dd");
    SimpleDateFormat mes = new SimpleDateFormat("MM");
    SimpleDateFormat ano = new SimpleDateFormat("yyyy");
    
    Date data = new Date();
    private String placa;
    private double valorDiaria, aliquota, valorQuilometragem;
    private String disponibilidade;
    private String tipo;
    


    public Automovel(String placa, double valorDiaria, double aliquota, String disponibilidade, double valorQuilometragem) {
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.valorQuilometragem = valorQuilometragem;
        this.aliquota = aliquota;
        this.disponibilidade = disponibilidade;
    }

    public Automovel(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public Automovel() {
    }
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public double getValorQuilometragem() {
        return valorQuilometragem;
    }

    public void setValorQuilometragem(double valorQuilometragem) {
        this.valorQuilometragem = valorQuilometragem;
    }


    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void cadastrarAutomovel(String placa){
        setPlaca(this.placa);

    }

    public void removerAutomovel(){

    }

    public void editarAutomovel(){

    }
    
    
}
