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

 
    
   

    private String nomeMotorista;


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

    public void realizarLocacao(Cliente cliente, Automovel automovel){
        //pegar entrada de datas 
        //pegar valor de tipo do carro 
        
        String dataLoc, dataDev; 
        dataLoc="12/05/2019"; 
        dataDev="20/06/2019";
        
       
        if(cliente.getUltimoMotorista()!=null){
            Motorista m = cliente.getUltimoMotorista();
            verificarHabilitacao(automovel.getTipo()+ "", m.getHabilitacao());
        }
       
    }
     public static boolean verificarHabilitacao(String tipo, String habilitacao){
        
        if(tipo=="UTILITARIO"){  
            if((habilitacao!="C")&&(habilitacao!="D")){
                return false;
            }
        }
        if(habilitacao=="A"){
            if
        }
        
        return false;
    }
    
  
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

