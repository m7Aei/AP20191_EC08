package br.com.ap220191.ec08_locacao_veiculos.model;


import br.com.ap220191.ec08_locacao_veiculos.model.dao.ClienteDAO;

public class Cliente extends ClienteDAO {

    private String nome;
    private String cpf;
    private boolean inadimplente = false;
    private boolean serasa = false;
    private Motorista ultimoMotorista;
    private String ultimaLocacaoData;
    private String usuario;
    private String senha;


    public String getUltimaLocacaoData() {
        return ultimaLocacaoData;
    }

    public void setUltimaLocacaoData(String ultimaLocacaoData) {
        this.ultimaLocacaoData = ultimaLocacaoData;
    }

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Motorista getUltimoMotorista() {
        return ultimoMotorista;
    }

    public void setUltimoMotorista(Motorista ultimoMotorista) {
        this.ultimoMotorista = ultimoMotorista;
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
