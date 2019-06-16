package br.com.ap220191.ec08_locacao_veiculos.util;

public class Cliente {
	private String nome;
	private String cpf;
	private boolean inadimplencia;
	private boolean serasa;
	
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
