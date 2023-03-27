package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	/**
	 * 
	 * @param orcamento
	 * @return desconto utilizado com o encadeamento das Classes de descontos
	 */
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoMaiorQueQuinhentos(
						new SemDesconto()));
		return desconto.efetuarCalculo(orcamento);
	}
}
