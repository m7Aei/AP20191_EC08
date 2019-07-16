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
        
        public static Double calcularPreco(int dias, Locacao locacao){
           Double kmTotal = (kmFinal-kmInicio);
           Double valorTotal = (kmTotal*7)+(dias*30);
           
           valorTotal= valorTotal + (valorTotal*(automovel.getTipo().getAliquota())/100);
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
