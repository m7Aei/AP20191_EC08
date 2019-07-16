package br.com.ap220191.ec08_locacao_veiculos.model;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
public class LocacaoTest {

    @Test
    public void TestaVerificacaoInadimplencia() {
        Cliente cliente = new Cliente("João", "12345678910");
        Locacao.verificaInadinplencia(cliente);
    }
    @Test
    public void TestaHabilitacaoMotorista() {

    }

    @Test
    public void TestaLocacaoBemSucedida() {
        String dataLoc, dataDev;
        dataLoc="12/05/2019";
        dataDev="20/06/2019";

        Motorista motorista = new Motorista("José", "5437A", "D", 5.0);
        Cliente cliente = new Cliente("João", "12345678910");
        Automovel a1 = new Automovel("123ABC", true, TipoAutomovel.UTILITARIO);
        a1.setQuilometragem(120000.);
        Locacao.verificaInadinplencia(cliente);
        Locacao.verificarHabilitacao(a1,motorista);
        Locacao loc = new Locacao(dataLoc,dataDev, cliente, motorista, a1);
        assertEquals(39,loc.calcularData(),0.1);
        assertEquals(120000.,loc.getQuilometragemLocacao(),0.1);
    }

    @Test
    public void TestaDevolucaoBemSucedida() {
        Motorista motorista = new Motorista("José", "5437A", "D", 5.0);
        Cliente cliente = new Cliente("João", "12345678910");
        Automovel automovel = new Automovel("123ABC", true, TipoAutomovel.UTILITARIO);
        automovel.setQuilometragem(120000.);
        Locacao loc = new Locacao("12/05/2019","20/06/2019", cliente, motorista, automovel);
        loc.realizarDevolucao(130000.);

        assert motorista.getDisponibilidadeMotorista();
        assert automovel.getDisponibilidade();
        loc.foiDevolvido();
    }
}
