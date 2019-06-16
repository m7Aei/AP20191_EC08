package br.com.ap220191.ec08_locacao_veiculos.model;
import java.util.Date;
public class Locacao {
    private Date dataLocacao;
    private Date dataDevolucao;
    private double quilometragemLocacao;
    private double quilometragemDevolucao;
    
    public boolean consultarDisponibilidade(String placa){
        return true;
    }
    public void realizarLocacao(String placa, Date dataLocacao){
        
    }
    public double calcularValor(Date dataLocacao, Date dataDevolucao){
        return 00.1;
    }
    
    
    
    
}
