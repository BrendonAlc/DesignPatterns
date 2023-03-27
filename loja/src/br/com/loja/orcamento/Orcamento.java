package br.com.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeDeItens;
	
	public Orcamento(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
	
}
