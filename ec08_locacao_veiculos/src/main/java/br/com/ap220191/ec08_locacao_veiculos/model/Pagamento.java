package br.com.ap220191.ec08_locacao_veiculos.model;

import br.com.ap220191.ec08_locacao_veiculos.model.dao.PagamentoDAO;

import javax.persistence.*;

@Entity
public class Pagamento extends PagamentoDAO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private int parcelamento;

	@Column
	private float valor;
        
        public static Double calcularPreco(Locacao locacao){
           int dias = Locacao.calcularData(locacao.getDataLocacao(), locacao.getDataLocacao());
           Double kmTotal = locacao.getQuilometragemDevolucao()-locacao.getQuilometragemLocacao();
           Double valorParcial = (kmTotal*7)+(dias*30);
           
           Double valorTotal, taxa=0.0; 
           if(locacao.getMotorista().getTempoEmpresa()>=5.0){
               taxa=5.0;
           }
           taxa=taxa+locacao.getAutomovel().getTipo().getAliquota();
           
           int diasDesconto = (int) Locacao.calcularData(locacao.getCliente().getUltimaLocacaoData() , locacao.getDataDevolucao());
           if(diasDesconto<15)
               taxa=taxa-10.0;
           
           taxa= taxa/100; 
           
           valorTotal= valorParcial*(taxa+1);
           
           
                    
            return valorTotal; 

            
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

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
