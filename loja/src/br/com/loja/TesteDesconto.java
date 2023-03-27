package br.com.loja;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.loja.desconto.CalculadoraDeDescontos;
import br.com.loja.orcamento.Orcamento;



public class TesteDesconto {

	public static void main(String[] args) {
		
		//Utilizar Padrão Strategy para classes dos impostos.
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 10);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));

	}
}
