package br.com.ap220191.ec08_locacao_veiculos.model;

import br.com.ap220191.ec08_locacao_veiculos.model.dao.AutomovelDAO;

import javax.persistence.*;

@Entity
@Table
public class Automovel extends AutomovelDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String placa;
    @Column
    private boolean disponibilidade;
    @Column
    private TipoAutomovel tipo;
    @Column 
    private Double quilometragem = new Double(0);

    public Automovel(String placa, boolean disponibilidade, TipoAutomovel tipo) {
        this.placa = placa;
        this.disponibilidade = disponibilidade;
        this.tipo = tipo;
    }

    public Automovel(){}

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
