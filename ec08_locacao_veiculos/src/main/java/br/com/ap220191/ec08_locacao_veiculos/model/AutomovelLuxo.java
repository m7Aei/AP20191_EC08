package br.com.ap220191.ec08_locacao_veiculos.model;

public class AutomovelLuxo extends Automovel {
    private double aliquota;
    private char habilitacaoExigida;

    public AutomovelLuxo(String placa, double valorDiaria, double aliquota, boolean disponibilidade, double aliquota1, char habilitacaoExigida, double valorQuilometragem) {
        super(placa, valorDiaria, aliquota, disponibilidade, valorQuilometragem);
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
