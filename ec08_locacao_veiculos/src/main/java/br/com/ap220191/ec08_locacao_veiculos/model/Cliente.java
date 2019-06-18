package br.com.ap220191.ec08_locacao_veiculos.model;

public class Cliente {
	private String nome;
	private String cpf;
	private boolean inadimplencia;
	private boolean serasa;

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	Cliente(String nome, String cpf, boolean inadimplencia, boolean serasa) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.inadimplencia = inadimplencia;
		this.serasa = serasa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isInadimplencia() {
		return inadimplencia;
	}

	public void setInadimplencia(boolean inadimplencia) {
		this.inadimplencia = inadimplencia;
	}

	public boolean isSerasa() {
		return serasa;
	}

	public void setSerasa(boolean serasa) {
		this.serasa = serasa;
	}

	public void cadastrarCliente(String nome, String cpf, boolean inadimplencia, boolean serasa) {
		this.nome = nome;
		this.cpf = cpf;
		this.inadimplencia = inadimplencia;
		this.serasa = serasa;
	}

	public String consultarCliente() {
		return "Cliente\nNome=" + nome + "\nCPF=" + cpf + "\nInadimplência? =" + inadimplencia + "\nSerasa? =" + serasa;
	}

	public void editarCliente() {

	}

	public void removerCliente() {

	}
}
