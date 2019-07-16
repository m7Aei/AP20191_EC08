package br.com.ap220191.ec08_locacao_veiculos.model;

public enum FormaPagamento {
    DINHEIRO(1), CARTAO_CREDITO(2), CARTAO_DEBITO(3), CHEQUE(4);

    private final int pgto;

    FormaPagamento(int forma) {
        pgto = forma;
    }

    public int getPgto() {
        return pgto;
    }

    public void mostraOpcao(FormaPagamento pgto) {
        if (pgto == FormaPagamento.DINHEIRO) {
            System.out.println("Pagamento em dinheiro.");
        }
        if (pgto == FormaPagamento.CARTAO_CREDITO) {
            System.out.println("Pagamento no cartão de crédito.");

            if (pgto == FormaPagamento.CARTAO_DEBITO) {
                System.out.println("Pagamento no cartão de débito");
            }
            if (pgto == FormaPagamento.CHEQUE) {
                System.out.println("Pagamento em cheque.");
            }
        }
    }
}
