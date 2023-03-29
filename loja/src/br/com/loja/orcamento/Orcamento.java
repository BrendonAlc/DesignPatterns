package br.com.loja.orcamento;

import java.math.BigDecimal;

import br.com.loja.orcamento.situacao.EmAnalise;
import br.com.loja.orcamento.situacao.Finalizado;
import br.com.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeDeItens;
	private SituacaoOrcamento situacao;
	
	public Orcamento(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
		this.situacao =new EmAnalise();
	}
	
	/**
	 * Padrão State
	 */
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}

	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
	
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento finalizado) {
		this.situacao = finalizado;
	}
	
	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}
}
