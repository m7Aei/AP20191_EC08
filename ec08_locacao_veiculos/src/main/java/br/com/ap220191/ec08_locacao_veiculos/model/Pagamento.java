package br.com.ap220191.ec08_locacao_veiculos.model;

import java.util.LinkedList;
import java.util.List;


public class Pagamento {
    public static List<Pagamento> pagamentos = new LinkedList<>();
    private int parcelamento;
    private Double valor = 0.0;
    private Locacao locacao;
    private Double precoQuilometro;
    private Double precoDia;
    private FormaPagamento formaPagamento;

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



    public Pagamento(int parcelamento, Locacao locacao, Double precoQuilometro, Double precoDia, FormaPagamento formaPagamento) {
        this.parcelamento = parcelamento;
        this.locacao = locacao;
        this.precoQuilometro = precoQuilometro;
        this.precoDia = precoDia;
        this.formaPagamento=formaPagamento;
        calcularPreco();
        pagamentos.add(this);
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

    public String gerarNota() {
    locacao.getCliente().setUltimaLocacaoData(locacao.getDataDevolucao());
    return this.toString();

    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "parcelamento=" + parcelamento +
                ", valor=" + valor +
                ", locacao=" + locacao.toString() +
                ", precoQuilometro=" + precoQuilometro +
                ", precoDia=" + precoDia +
                ", formaPagamento=" + formaPagamento +
                '}';
    }

    public static boolean validaPagamentoCheque(Cliente cliente) {
        if (cliente.getSerasaOuSpc()){
            System.out.print("Cliente não aprovado para pagamento em cheque");
            return false;
        }
        return true;
    }
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
