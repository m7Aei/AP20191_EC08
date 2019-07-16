package br.com.ap220191.ec08_locacao_veiculos.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Locacao {

    private String dataLocacao;
    private String dataDevolucao;
    private double quilometragemLocacao = 0;
    private double quilometragemDevolucao;
    private String cpfCliente;
    private String nomeMotorista;
    private String placa;
    private String tipoAutomovel;
    private boolean status;
    private String valorDiaria, valorQuilometragem;


    Date data = new Date();

    public Locacao(String cpfCliente, String motorista, String tipoAutomovel, String dataLocacao, String dataDevolucao, String placa, String valorDiaria, String valorQuilometragem ) {
        this.cpfCliente = cpfCliente;
        this.nomeMotorista = motorista;
        this.tipoAutomovel = tipoAutomovel;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.valorQuilometragem = valorQuilometragem;
    }

    public Locacao() {
    }

    public Locacao(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Locacao(String dataLocacao, String dataDevolucao) {
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
    }
    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getQuilometragemLocacao() {
        return quilometragemLocacao;
    }

    public void setQuilometragemLocacao(double quilometragemLocacao) {
        this.quilometragemLocacao = quilometragemLocacao;
    }

    public double getQuilometragemDevolucao() {
        return quilometragemDevolucao;
    }

    public void setQuilometragemDevolucao(double quilometragemDevolucao) {
        this.quilometragemDevolucao = quilometragemDevolucao;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoAutomovel() {
        return tipoAutomovel;
    }

    public void setTipoAutomovel(String tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(String valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getValorQuilometragem() {
        return valorQuilometragem;
    }

    public void setValorQuilometragem(String valorQuilometragem) {
        this.valorQuilometragem = valorQuilometragem;
    }
    
    

    public String dataAtual() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        Date date = new Date();
        String dataAtualString = dateFormat.format(date);
        return dataAtualString;
    }

    public double valorKilometragem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
