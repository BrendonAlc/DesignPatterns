package br.com.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.DomainException;
import br.com.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	//método para a classe finalizado, para retornar sem desconto.
	public abstract BigDecimal calcularValorDescontoExtra(Orcamento orcamento);
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser finalizado!");
	}
}
