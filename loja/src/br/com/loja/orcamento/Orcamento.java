package br.com.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.loja.orcamento.situacao.EmAnalise;
import br.com.loja.orcamento.situacao.Finalizado;
import br.com.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel{

	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	private List<Orcavel> itens;

	public Orcamento() {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.situacao = new EmAnalise();

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
		return itens.size();
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

	public void adicionarItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}
}
