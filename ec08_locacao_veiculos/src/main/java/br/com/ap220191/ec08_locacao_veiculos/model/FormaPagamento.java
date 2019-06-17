package br.com.ap220191.ec08_locacao_veiculos.model;

public enum FormaPagamento {
	DINHEIRO(1), CARTAO(2), CHEQUE(3);
	
	private final int pgto;
	FormaPagamento(int forma) {
		pgto = forma;
	}
	public int getPgto() {
		return pgto;
	}
}
