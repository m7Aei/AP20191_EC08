package br.com.ap220191.ec08_locacao_veiculos.model;


import br.com.ap220191.ec08_locacao_veiculos.model.dao.ClienteDAO;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table
public class Cliente extends ClienteDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private boolean inadimplente;
    @Column
    private boolean serasa;
    @Transient
    private Motorista ultimoMotorista;
    @Transient
    private Date ultimaLocacao; 
    @Column
    private String usuario;
    @Column
    private String senha;
    @Column
    private Integer idUltimoMotorista;

    public Cliente(String nome, String cpf, boolean inadimplente, boolean serasa) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.inadimplente = inadimplente;
        this.serasa = serasa;
    }


    public Cliente(String nome, String usuario, String senha, String cpf, boolean inadimplente, boolean serasa) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.cpf = cpf;
        this.inadimplente = inadimplente;
        this.serasa = serasa;
    }

    public Motorista getUltimoMotorista() {
        return ultimoMotorista;
    }

    public void setUltimoMotorista(Motorista ultimoMotorista) {
        this.ultimoMotorista = ultimoMotorista;
    }



    public Cliente(String nome, String cpf, boolean inadimplente, boolean serasa, Motorista ultimoMotorista) {
        this.nome = nome;
        this.cpf = cpf;
        this.inadimplente = inadimplente;
        this.serasa = serasa;
        this.ultimoMotorista = ultimoMotorista;
    }

    public Cliente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean getInadimplente() {
        return inadimplente;
    }

    public void setInadimplente(boolean inadimplente) {
        this.inadimplente = inadimplente;
    }

    public boolean getSerasa() {
        return serasa;
    }

    public void setSerasa(boolean serasa) {
        this.serasa = serasa;
    }
}
