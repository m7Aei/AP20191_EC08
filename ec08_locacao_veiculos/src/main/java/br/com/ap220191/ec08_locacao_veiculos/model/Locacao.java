package br.com.ap220191.ec08_locacao_veiculos.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Locacao {
    public static List<Locacao> locacoes = new LinkedList<>();
    private String dataLocacao;
    private String dataDevolucao;
    private double quilometragemLocacao;
    private double quilometragemDevolucao;
    private Cliente cliente;
    private Motorista motorista;
    private Automovel automovel;
    private boolean devolvido;

    public Locacao(String dataLocacao, String dataDevolucao, Cliente cliente, Motorista motorista, Automovel automovel) {
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.cliente = cliente;
        this.motorista = motorista;
        this.automovel = automovel;
        this.quilometragemLocacao = automovel.getQuilometragem();
        //mudando status
        this.motorista.setDisponibilidadeMotorista(false);
        this.automovel.setDisponibilidade(false);
        this.devolvido = false;
        locacoes.add(this);

    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public double getQuilometragemLocacao() {
        return quilometragemLocacao;
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


    public Motorista getMotorista() {
        return motorista;
    }

    public Automovel getAutomovel() {
        return automovel;
    }


    public boolean foiDevolvido() {
        return devolvido;
    }

    public int calcularData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate inicio = LocalDate.parse(getDataLocacao(), formatter);
        LocalDate fim = LocalDate.parse(getDataDevolucao(), formatter);
        return (int) inicio.until(fim, ChronoUnit.DAYS);
    }

    public static int calcularData(String in, String fi) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate inicio = LocalDate.parse(in, formatter);
        LocalDate fim = LocalDate.parse(fi, formatter);
        return (int) inicio.until(fim, ChronoUnit.DAYS);
    }

    public static boolean verificaInadinplencia(Cliente cliente) {
        if (cliente.getInadimplente()) {
            System.out.println("o cliente não pode realizar novas locações inadimplente");
            return false;
        }
        return true;
    }
    public static boolean verificaDisponibilidadeMotorista(Motorista motorista) {
        if (!motorista.getDisponibilidadeMotorista()) {
            System.out.println("Motorista nào disponivel");
            return false;
        }
        return true;
    }
    public static boolean verificaDisponibilidadeAutomovel(Automovel automovel) {
        if (!automovel.getDisponibilidade()) {
            System.out.println("Automovel não disponivel");
            return false;
        }
        return true;
    }

    public static boolean verificarHabilitacao(Automovel automovel, Motorista motorista) {
        String tipoCarro = automovel.getTipo().toString();
        String habilitacaoMotorista = motorista.getHabilitacao();
        return verificarHabilitacao(tipoCarro, habilitacaoMotorista);
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

    public void realizarDevolucao(Double kmFinal) {
        this.motorista.setDisponibilidadeMotorista(true);
        this.automovel.setDisponibilidade(true);
        this.devolvido = true;
        this.quilometragemDevolucao = kmFinal;
        automovel.setQuilometragem(kmFinal);
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "dataLocacao='" + dataLocacao + '\'' +
                ", dataDevolucao='" + dataDevolucao + '\'' +
                ", quilometragemLocacao=" + quilometragemLocacao +
                ", quilometragemDevolucao=" + quilometragemDevolucao +
                ", cliente=" + cliente.toString() +
                ", motorista=" + motorista.toString() +
                ", automovel=" + automovel.toString() +
                ", devolvido=" + devolvido +
                '}';
    }
}
