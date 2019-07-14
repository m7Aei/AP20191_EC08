package br.com.ap220191.ec08_locacao_veiculos.model;
import java.util.List;

public class Motorista {
    private String nome, matricula;
    private String habilitacao;
    private String tempoEmpresa;
    private boolean disponibilidadeMotorista;
    
    public Motorista(String nome, String matricula, String habilitacao, String tempoEmpresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.habilitacao = habilitacao;
        this.tempoEmpresa = tempoEmpresa;
        this.disponibilidadeMotorista = true;
    }

    public Motorista() {
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

    public boolean getDisponibilidadeMotorista() {
        return disponibilidadeMotorista;
    }

    public void setDisponibilidadeMotorista(boolean disponibilidadeMotorista) {
        this.disponibilidadeMotorista = disponibilidadeMotorista;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getTempoEmpresa() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(String tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }

    public void cadastrarMotorista(String nome, String matricula, char habilitacao, int tempoEmpresa){
        setNome(this.nome);
        setMatricula(this.matricula);
        setHabilitacao(this.habilitacao);
        setTempoEmpresa(this.tempoEmpresa);
    }

    public void removerMotorista(){

    }

    public void editarMotorista(){

    }

    public char verificarHabilitacao(){
        return ' ';
    }
}
