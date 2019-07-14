package br.com.ap220191.ec08_locacao_veiculos.model;

import javax.persistence.*;

@Entity(name = "Pagamento")
public class Pagamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private int parcelamento;

	@Column
	private float valor;
	
//	public void efetuarPagamento() {
//
//	}
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
