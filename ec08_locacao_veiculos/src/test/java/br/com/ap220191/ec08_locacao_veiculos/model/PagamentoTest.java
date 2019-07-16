package br.com.ap220191.ec08_locacao_veiculos.model;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.Test;

import static org.junit.Assert.*;
public class PagamentoTest {

    public Locacao setupLocacao(){
        Motorista motorista = new Motorista("José", "5437A", "D", 5.0);
        Cliente cliente = new Cliente("João", "12345678910");
        Automovel automovel = new Automovel("123ABC", true, TipoAutomovel.UTILITARIO);
        automovel.setQuilometragem(120000.);
        Locacao locacao = new Locacao("12/05/2019","20/06/2019", cliente, motorista, automovel);
        locacao.realizarDevolucao(130000.);
        //simula ultima locacao para data qualquer anterior
        cliente.setUltimaLocacaoData("11/02/2019");
        return locacao;
    }

    @Test
    public void TestaCalcularPreco() {
        Locacao locacao = setupLocacao();
        Pagamento pagamento = new Pagamento(1,locacao,0.25,2.00, FormaPagamento.CARTAO_CREDITO);
        assertEquals(3156.0,pagamento.getValor(),0.001);
    }
    @Test
    public void TestaNota() {
        Locacao locacao = setupLocacao();
        Pagamento pagamento = new Pagamento(1,locacao,0.25,2.00, FormaPagamento.CARTAO_CREDITO);

       System.out.println(pagamento.gerarNota());
    }
}
