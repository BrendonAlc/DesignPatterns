package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

/**
 * 
 * @author brend
 * Interface para aplicar os parametros de calcular imposto
 */
public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}
