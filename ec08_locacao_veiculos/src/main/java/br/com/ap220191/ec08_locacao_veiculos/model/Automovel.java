package br.com.ap220191.ec08_locacao_veiculos.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract public class Automovel {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat dia = new SimpleDateFormat("dd");
    SimpleDateFormat mes = new SimpleDateFormat("MM");
    SimpleDateFormat ano = new SimpleDateFormat("yyyy");
    
    Date data = new Date();
    private String placa;
    private double valorDiaria, aliquota, valorQuilometragem, quilometragemInicial, quilometragemFinal;
    private boolean disponibilidade;
    private String dataLocacao, dataDevolucao;

    public Automovel(String placa, double valorDiaria, double aliquota, boolean disponibilidade, double valorQuilometragem) {
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.valorQuilometragem = valorQuilometragem;
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

    public double getValorQuilometragem() {
        return valorQuilometragem;
    }

    public void setValorQuilometragem(double valorQuilometragem) {
        this.valorQuilometragem = valorQuilometragem;
    }

    public double getQuilometragemInicial() {
        return quilometragemInicial;
    }

    public void setQuilometragemInicial(double quilometragemInicial) {
        this.quilometragemInicial = quilometragemInicial;
    }

    public double getQuilometragemFinal() {
        return quilometragemFinal;
    }

    public void setQuilometragemFinal(double quilometragemFinal) {
        this.quilometragemFinal = quilometragemFinal;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao){
        this.dataLocacao = dataLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
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
    
    public double calcularValor(){
        int dias, meses, anos;
        Date data1 = null, data2 = null;
        try {
             data1 = sdf.parse(getDataLocacao());
        } catch (ParseException ex) {
            Logger.getLogger(Automovel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             data2 = sdf.parse(getDataDevolucao());
        } catch (ParseException ex) {
            Logger.getLogger(Automovel.class.getName()).log(Level.SEVERE, null, ex);
        }
        int dl = Integer.parseInt(dia.format(data1));
        int dd = Integer.parseInt(dia.format(data2));
        int ml = Integer.parseInt(mes.format(data1));
        int md = Integer.parseInt(mes.format(data2));
        int al = Integer.parseInt(ano.format(data1));
        int ad = Integer.parseInt(ano.format(data2));
        if(dd >= dl){
            dias = dd - dl;
        }else{
            dias = (30 + dd) - dl;
            md = md--;
        }
        if(md >= ml){
            meses = md - ml;
        }else{
            meses = (12 + md) - ml;
            ad = ad--;
        }
        anos = ad - al;
        int diasTotais = (360 * anos) + (12 * meses) + dias;
        
        return (diasTotais * getValorDiaria()) + (getQuilometragemFinal() - getQuilometragemInicial())*getValorQuilometragem();
        
    }
}
