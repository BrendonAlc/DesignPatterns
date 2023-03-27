package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

/**
 * 
 * @author brend
 *@implNote Para que a classe de Desconto tenha um fim, criado a SemDesconto
 */
public class SemDesconto extends Desconto{
	public SemDesconto() {
		super(null);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	//Aplicar padrão Template Method retornando true
	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
}
