package br.com.ap220191.ec08_locacao_veiculos.model;

import br.com.ap220191.ec08_locacao_veiculos.model.dao.PagamentoDAO;


public class Pagamento extends PagamentoDAO {

    private int parcelamento;
    private Double valor = 0.0;
    private Locacao locacao;
    private Double precoQuilometro;
    private Double precoDia;
    public Double getPrecoQuilometro() {
        return precoQuilometro;
    }

    public Double getPrecoDia() {
        return precoDia;
    }



    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    private FormaPagamento formaPagamento;

    public Pagamento(int parcelamento, Locacao locacao, Double precoQuilometro, Double precoDia) {
        this.parcelamento = parcelamento;
        this.locacao = locacao;
        this.precoQuilometro = precoQuilometro;
        this.precoDia = precoDia;
        calcularPreco();
    }

    public void calcularPreco() {
        int dias = locacao.calcularData();
        Double kmTotal = locacao.getQuilometragemDevolucao() - locacao.getQuilometragemLocacao();
        Double valorParcial = (kmTotal * precoQuilometro) + (dias * precoDia);
        Double taxa = 0.0;
        if (locacao.getMotorista().getTempoEmpresa() >= 5.0) {
            taxa = 5.0;
        }
        taxa = taxa + locacao.getAutomovel().getTipo().getAliquota();
        if (locacao.getCliente().getUltimaLocacaoData()!=null) {
            int diasDesconto = Locacao.calcularData(locacao.getCliente().getUltimaLocacaoData(), locacao.getDataDevolucao());
            if (diasDesconto < 15)
                taxa = taxa - 10.0;
        }
        taxa = taxa / 100;
        this.setValor(valorParcial * (taxa + 1));
    }

    public void efetuarPagamento() {

    }
//	public void consultarSerasa() {
//
//	}
//	public void consultarInadimplencia() {
//
//	}

    public int getParcelamento() {
        return parcelamento;
    }

    public void setParcelamento(int parcelamento) {
        this.parcelamento = parcelamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
