package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

/**
 * 
 * @author brend
 * Interface para aplicar os parametros de calcular imposto
 */
public abstract class Imposto {
	
	private Imposto outro;

	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		//verificando impostos a serem calculados, somando os valores
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		if (outro != null) {
			valorDoOutroImposto = outro.realizarCalculo(orcamento);
		}
		return valorImposto.add(valorDoOutroImposto);
	}


}
