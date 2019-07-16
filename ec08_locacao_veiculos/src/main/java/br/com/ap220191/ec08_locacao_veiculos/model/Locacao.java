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

    private String nomeMotorista;

    Date data = new Date();

    public Locacao(String dataLocacao, String dataDevolucao, double quilometragemLocacao, Cliente cliente, Motorista motorista, Automovel automovel, boolean status) {
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.quilometragemLocacao = quilometragemLocacao;
        this.cliente = cliente;
        this.motorista = motorista;
        this.automovel = automovel;
        this.status = status;
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

    public int calcularData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate inicio = LocalDate.parse(getDataLocacao(), formatter);
        LocalDate fim = LocalDate.parse(getDataDevolucao(), formatter);
        return (int) inicio.until(fim, ChronoUnit.DAYS);
    }

    public boolean realizarLocacao(Cliente cliente, Automovel automovel) {
        //pegar entrada de datas
        //pegar valor de tipo do carro 

        String dataLoc, dataDev;
        dataLoc = "12/05/2019";
        dataDev = "20/06/2019";

        verificarMotorista(cliente, automovel);
            
        if(!verificaInadinplencia(cliente))
            return false; 
        setQuilometragemLocacao(automovel.getQuilometragem());
        setStatus(true);
        return true; 
    }

    public static boolean verificaInadinplencia(Cliente cliente) {
        if (cliente.getInadimplente()) {
            System.out.println("o cliente n�o pode realizar novas loca��es inadimplente");
            return false; 
        }
        return true; 
    }

    public static void verificarMotorista(Cliente cliente, Automovel automovel) {
        if (cliente.getUltimoMotorista() != null) {
            Motorista m = cliente.getUltimoMotorista();
            if (!(verificarHabilitacao(automovel.getTipo() + "", m.getHabilitacao()))) {
                System.out.print("Habilita��o inv�lida, procure outro motorista");
               //listar todos os motoristas e pegar o de maior tempo 
                //Motorista.listarTodos();
            }
        } else {
            System.out.print("Sem ultimo motorista");
            //Motorista.listarTodos();
        }
    }

    public static boolean verificarHabilitacao(String tipo, String habilitacao) {

        if (tipo.equalsIgnoreCase("UTILITARIO")) {

            if ((!(habilitacao.equalsIgnoreCase("C"))) && (!(habilitacao.equalsIgnoreCase("D")))) {

                return false;
            }
        }
        if (habilitacao.equalsIgnoreCase("A")) {
            return false;
        } else {
            return true;
        }

    }
    
    public boolean realizarDevolucao(Double kmFinal){
        Double KmTotal; 
        //Quantos km foram rodados? 
        
        setQuilometragemDevolucao(kmFinal);
        automovel.setQuilometragem(kmFinal);
        
        Pagamento.calcularPreco(calcularData(),this); 
        
        
        
        return true;
    }

}
