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

    public Locacao(String dataLocacao, String dataDevolucao, Cliente cliente, Motorista motorista, Automovel automovel) {
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.cliente = cliente;
        this.motorista = motorista;
        this.automovel = automovel;
        this.quilometragemLocacao = automovel.getQuilometragem();
        this.status = false;
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

    public static int calcularData(String in, String fi) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate inicio = LocalDate.parse(in, formatter);
        LocalDate fim = LocalDate.parse(fi, formatter);
        return (int) inicio.until(fim, ChronoUnit.DAYS);
    }

    public void realizarLocacao(Cliente cliente, Automovel automovel) {
    }

    public static boolean verificaInadinplencia(Cliente cliente) {
        if (cliente.getInadimplente()) {
            System.out.println("o cliente não pode realizar novas locações inadimplente");
            return false; 
        }
        return true; 
    }

    public static void verificarMotorista(Cliente cliente, Automovel automovel) {
        if (cliente.getUltimoMotorista() != null) {
            Motorista m = cliente.getUltimoMotorista();
            if (!(verificarHabilitacao(automovel.getTipo() + "", m.getHabilitacao()))) {
                System.out.print("Habilitação inválida, procure outro motorista");
               //listar todos os motoristas e pegar o de maior tempo 
                //Motorista.listarTodos();
            }
        } else {
            System.out.print("Sem ultimo motorista");
            //Motorista.listarTodos();
        }
    }

    public static boolean verificarHabilitacao(Automovel automovel,Motorista motorista){
        String tipoCarro = automovel.getTipo().toString();
        String habilitacaoMotorista = motorista.getHabilitacao();
        return verificarHabilitacao(tipoCarro,habilitacaoMotorista);
    }

    public static boolean verificarHabilitacao(String tipoCarro, String habilitacaoMotorista) {
        if (tipoCarro.equalsIgnoreCase("UTILITARIO")) {

            if ((!(habilitacaoMotorista.equalsIgnoreCase("C"))) && (!(habilitacaoMotorista.equalsIgnoreCase("D")))) {

                return false;
            }
        }
        if (habilitacaoMotorista.equalsIgnoreCase("A")) {
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

        //Pagamento.calcularPreco(calcularData(),this);



        return true;
    }

}
