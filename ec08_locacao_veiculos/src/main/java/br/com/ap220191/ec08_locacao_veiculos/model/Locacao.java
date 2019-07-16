package br.com.ap220191.ec08_locacao_veiculos.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Locacao {
    
    private String dataLocacao;
    private String dataDevolucao;
    private double quilometragemLocacao;
    private double quilometragemDevolucao;
    private Cliente cliente;
    private Motorista motorista;
    private Automovel automovel;
    private boolean status;
    
    

    public Locacao(String dataLocacao, String dataDevolucao, double quilometragemLocacao, Cliente cliente, Motorista motorista, Automovel automovel, boolean status) {
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.quilometragemLocacao = quilometragemLocacao;
        this.cliente = cliente;
        this.motorista = motorista;
        this.automovel = automovel;
        this.status = status;
    }

 
    
   
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat dia = new SimpleDateFormat("dd");
    SimpleDateFormat mes = new SimpleDateFormat("MM");
    SimpleDateFormat ano = new SimpleDateFormat("yyyy");
    
    Date data = new Date();

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int calcularData(){    
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDate inicio =  LocalDate.parse(getDataLocacao(), formatter);
     LocalDate fim = LocalDate.parse(getDataDevolucao(), formatter);
     return (int) inicio.until(fim, ChronoUnit.DAYS);
    }

    public Locacao() {
    }
    
  
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

