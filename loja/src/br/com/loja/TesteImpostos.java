package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.imposto.CalculadoraDeImpostos;
import br.com.loja.imposto.ICMS;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		
//		//Teste
//		//Utilizar Padrão Strategy para classes dos impostos.
//		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
//		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
//		System.out.println(calculadora.calcular(orcamento, new ISS()));
//		System.out.println();
//		Orcamento orcamento1 = new Orcamento(new BigDecimal("0"));
//		CalculadoraDeImpostos calculadora1 = new CalculadoraDeImpostos();
//		System.out.println(calculadora.calcular(orcamento1, new ISS()));
		

		System.out.println();
		System.out.println("Teste da Classe Imposto refatorada utilizando Pattern Decorator");
		System.out.println();
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ISS(null)));
		System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
	}

}
