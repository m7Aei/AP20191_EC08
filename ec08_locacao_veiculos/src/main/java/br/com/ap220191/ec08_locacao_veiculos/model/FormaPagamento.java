package br.com.ap220191.ec08_locacao_veiculos.model;

public enum FormaPagamento {
	DINHEIRO(1), CARTAOCREDITO1X(2), CARTAOCREDITO2X(3), CARTAOCREDITO3X(4), CARTAODEBITO(3), CHEQUE(4);
	
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
        if(pgto == FormaPagamento.CARTAOCREDITO1X){
            System.out.println("Pagamento no cart�o de cr�dito.\nCr�dito � vista.");
        }
        if(pgto == FormaPagamento.CARTAOCREDITO2X){
            System.out.println("Pagamento no cart�o de cr�dito.\nParcelado 2x.");
        }
        if(pgto == FormaPagamento.CARTAOCREDITO3X){
            System.out.println("Pagamento no cart�o de cr�dito.\nParcelado 3x.");
        }
        if(pgto == FormaPagamento.CARTAODEBITO){
            System.out.println("Pagamento no cart�o de d�bito");
        }
        if(pgto == FormaPagamento.CHEQUE){
            System.out.println("Pagamento em cheque.");
        }
    }
}
