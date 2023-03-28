package br.com.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.DomainException;
import br.com.loja.orcamento.Orcamento;

/**
 * 
 * @author brend
 *Aplicando padrão State
 */
public class Finalizado extends SituacaoOrcamento{

	@Override
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado não pode ter desconto extra!");
	}
	
}
