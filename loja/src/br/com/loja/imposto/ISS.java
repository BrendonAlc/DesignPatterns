package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

/**
 * 
 * @author brend Utilizar padrão 
 * 
 * @implNote Padrão Strategy para separar impostos e não deixar a classe crescer sempre
 */
public class ISS implements Imposto {

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
}
