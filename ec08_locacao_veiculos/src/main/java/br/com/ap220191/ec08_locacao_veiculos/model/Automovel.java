package br.com.ap220191.ec08_locacao_veiculos.model;

import br.com.ap220191.ec08_locacao_veiculos.model.dao.AutomovelDAO;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;


public class Automovel extends AutomovelDAO {
    public static List<Automovel> automoveis = new LinkedList<>();
    private String placa;
    private boolean disponibilidade;
    private TipoAutomovel tipo;
    private Double quilometragem = 0.0;

    public Automovel(String placa, boolean disponibilidade, TipoAutomovel tipo) {
        this.placa = placa;
        this.disponibilidade = disponibilidade;
        this.tipo = tipo;
        automoveis.add(this);
    }

    public Double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    public TipoAutomovel getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovel tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

   

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void cadastrarAutomovel(String placa) {
        setPlaca(this.placa);

    }

    @Override
    public String toString() {
        return "Automovel{" +
                "placa='" + placa + '\'' +
                ", tipo=" + tipo +
                ", quilometragem=" + quilometragem +
                '}';
    }

    public void removerAutomovel() {

    }

    public void editarAutomovel() {

    }

}
