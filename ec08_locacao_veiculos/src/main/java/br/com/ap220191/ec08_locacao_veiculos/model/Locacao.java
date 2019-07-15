package br.com.ap220191.ec08_locacao_veiculos.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Locacao {
    
    private Date dataLocacao;
    private Date dataDevolucao;
    private double quilometragemLocacao = 0;
    private double quilometragemDevolucao;
    private String cpfCliente;
    private String matriculaMotorista;
    private String placa;
    private boolean status;
    private String nomeMotorista;



    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat dia = new SimpleDateFormat("dd");
    SimpleDateFormat mes = new SimpleDateFormat("MM");
    SimpleDateFormat ano = new SimpleDateFormat("yyyy");

    Date data = new Date();

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
  
    
    public double calcularValor() throws ParseException {
        int dias, meses, anos;
        Date data1 = null, data2 = null;
        data1 = sdf.parse(String.valueOf(getDataLocacao()));
        data2 = sdf.parse(String.valueOf(getDataDevolucao()));
        int dl = Integer.parseInt(dia.format(data1));
        int dd = Integer.parseInt(dia.format(data2));
        int ml = Integer.parseInt(mes.format(data1));
        int md = Integer.parseInt(mes.format(data2));
        int al = Integer.parseInt(ano.format(data1));
        int ad = Integer.parseInt(ano.format(data2));
        if(dd >= dl){
            dias = dd - dl;
        }else{
            dias = (30 + dd) - dl;
            md = md--;
        }
        if(md >= ml){
            meses = md - ml;
        }else{
            meses = (12 + md) - ml;
            ad = ad--;
        }
        anos = ad - al;
        int diasTotais = (360 * anos) + (12 * meses) + dias;
        
//        return (diasTotais * getValorDiaria()) + (getQuilometragemFinal() - getQuilometragemInicial())*getValorQuilometragem();
        return diasTotais;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
