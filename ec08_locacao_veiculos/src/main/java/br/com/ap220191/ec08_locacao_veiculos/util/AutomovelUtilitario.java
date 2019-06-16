package com.vee;

public class AutomovelUtilitario extends Automovel {
    private double aliquota;
    private char habilitacaoExigida;

    public AutomovelUtilitario(String placa, double valorDiaria, double aliquota, boolean disponibilidade, double aliquota1, char habilitacaoExigida) {
        super(placa, valorDiaria, aliquota, disponibilidade);
        this.aliquota = aliquota1;
        this.habilitacaoExigida = habilitacaoExigida;
    }

    @Override
    public double getAliquota() {
        return aliquota;
    }

    @Override
    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public char getHabilitacaoExigida() {
        return habilitacaoExigida;
    }

    public void setHabilitacaoExigida(char habilitacaoExigida) {
        this.habilitacaoExigida = habilitacaoExigida;
    }
}
