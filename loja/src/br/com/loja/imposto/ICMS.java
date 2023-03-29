package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

/**
 * 
 * @author brend
 * 
 * @implNote Padrão Strategy para separar impostos e não deixar a classe crescer sempre
 */
public class ICMS extends Imposto{

	public ICMS(Imposto outro) {
		super(outro);
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return calcular(orcamento);
	}
}
