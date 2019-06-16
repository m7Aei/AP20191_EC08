package br.com.ap220191.ec08_locacao_veiculos.util;

public class AutomovelSimples extends Automovel{
    private double aliquota;
    private char habilitacaoExigida;

    public AutomovelSimples(String placa, double valorDiaria, double aliquota, boolean disponibilidade, double aliquota1, char habilitacaoExigida) {
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
