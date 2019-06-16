package com.vee;

import java.util.List;

public class Motorista {
    private String nome, matricula;
    private char habilitacao;
    private int tempoEmpresa;

    public Motorista(String nome, String matricula, char habilitacao, int tempoEmpresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.habilitacao = habilitacao;
        this.tempoEmpresa = tempoEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public char getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(char habilitacao) {
        this.habilitacao = habilitacao;
    }

    public int getTempoEmpresa() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(int tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }

    public void cadastrarMotorista(){

    }

    public void removerMotorista(){

    }

    public void editarMotorista(){

    }

    public char verificarHabilitacao(){

    }

    public List gerarPrioridade(){

    }
}
