package br.com.ap220191.ec08_locacao_veiculos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Automovel {
    @Column
    private String placa;
    @Column
    private boolean disponibilidade;
    @Column
    private TipoAutomovel tipo;

    public Automovel(String placa, boolean disponibilidade, TipoAutomovel tipo) {
        this.placa = placa;
        this.disponibilidade = disponibilidade;
        this.tipo = tipo;
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

   

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void cadastrarAutomovel(String placa) {
        setPlaca(this.placa);

    }

    public void removerAutomovel() {

    }

    public void editarAutomovel() {

    }

}
