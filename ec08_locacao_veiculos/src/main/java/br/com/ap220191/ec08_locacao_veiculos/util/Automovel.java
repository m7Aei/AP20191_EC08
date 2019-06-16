package br.com.ap220191.ec08_locacao_veiculos.util;
import java.util.Scanner;

public class Automovel {
    private String placa;
    private double valorDiaria, aliquota;
    private boolean disponibilidade;

    public Automovel(String placa, double valorDiaria, double aliquota, boolean disponibilidade) {
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.aliquota = aliquota;
        this.disponibilidade = disponibilidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void cadastrarAutomovel(){

    }

    public void removerAutomovel(){

    }

    public void editarAutomovel(){

    }
}
