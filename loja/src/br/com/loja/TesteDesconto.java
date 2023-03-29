package br.com.loja;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.loja.desconto.CalculadoraDeDescontos;
import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;



public class TesteDesconto {

	public static void main(String[] args) {
		
		//Utilizar Padrão Strategy para classes dos impostos.
		Orcamento primeiro = new Orcamento();
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));


		Orcamento segundo = new Orcamento();
		segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		
		Orcamento terceiro = new Orcamento();
		terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
		System.out.println(calculadora.calcular(terceiro));

	}
}
