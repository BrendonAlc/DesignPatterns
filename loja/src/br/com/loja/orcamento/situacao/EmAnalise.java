package br.com.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.DomainException;
import br.com.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento{

	/**
	 * Aplicando padrão State
	 */
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	public void aprovar(Orcamento orcamento) throws DomainException{
		orcamento.setSituacao(new Aprovado());
	}
	
	public void reprovar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Reprovado());
	}
}
