package br.com.ap220191.ec08_locacao_veiculos.model;

import br.com.ap220191.ec08_locacao_veiculos.model.dao.MotoristaDAO;
import jdk.internal.dynalink.beans.StaticClass;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

public class Motorista extends MotoristaDAO {
    public static List<Motorista> motoristas = new LinkedList<>();
    private String nome;
    private String matricula;
    private String habilitacao;
    private Double tempoEmpresa;
    private boolean disponibilidadeMotorista;

    public Motorista(String nome, String matricula, String habilitacao, Double tempoEmpresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.habilitacao = habilitacao;
        this.tempoEmpresa = tempoEmpresa;
        this.disponibilidadeMotorista = true;
        motoristas.add(this);
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

    public Double getTempoEmpresa() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(Double tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }

    public static List<Motorista> obterMotoristaExperientes (){
        List<Motorista> motoristasExperientes =  new LinkedList<Motorista>();
        for(Motorista motorista : motoristas ) {
            if(motorista.getTempoEmpresa() > 5 ){
                motoristasExperientes.add(motorista);
            }
        }
        return motoristasExperientes;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
