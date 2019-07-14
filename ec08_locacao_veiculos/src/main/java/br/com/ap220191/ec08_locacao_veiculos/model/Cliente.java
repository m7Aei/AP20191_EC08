package br.com.ap220191.ec08_locacao_veiculos.model;

public class Cliente {
	private String nome;
        private String usuario;
        private String senha;
	private String cpf;
	private boolean inadimplente;
	private boolean serasa;

    public Cliente(String nome, String usuario, String senha, String cpf, boolean inadimplente, boolean serasa) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.cpf = cpf;
        this.inadimplente = inadimplente;
        this.serasa = serasa;
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
