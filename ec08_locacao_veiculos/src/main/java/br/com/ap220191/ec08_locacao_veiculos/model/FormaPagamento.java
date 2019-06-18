package br.com.ap220191.ec08_locacao_veiculos.model;

public enum FormaPagamento {
	DINHEIRO(1), CARTAO_CREDITO_1X(2), CARTAO_CREDITO_2X(3), CARTAO_CREDITO_3X(4), CARTAO_DEBITO(3), CHEQUE(4);
	
	private final int pgto;
	FormaPagamento(int forma) {
		pgto = forma;
	}
	public int getPgto() {
		return pgto;
	}
	
	public void mostraOpcao(FormaPagamento pgto){
        if(pgto == FormaPagamento.DINHEIRO){
            System.out.println("Pagamento em dinheiro.");
        }
        if(pgto == FormaPagamento.CARTAO_CREDITO_1X){
            System.out.println("Pagamento no cartão de crédito.\nCrédito à vista.");
        }
        if(pgto == FormaPagamento.CARTAO_CREDITO_2X){
            System.out.println("Pagamento no cartão de crédito.\nParcelado 2x.");
        }
        if(pgto == FormaPagamento.CARTAO_CREDITO_3X){
            System.out.println("Pagamento no cartão de crédito.\nParcelado 3x.");
        }
        if(pgto == FormaPagamento.CARTAO_DEBITO){
            System.out.println("Pagamento no cartão de débito");
        }
        if(pgto == FormaPagamento.CHEQUE){
            System.out.println("Pagamento em cheque.");
        }
    }
}
