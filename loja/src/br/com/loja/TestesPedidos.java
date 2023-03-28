package br.com.loja;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GeraPedidoHandler;
import br.com.loja.pedido.Pedido;
import br.com.loja.pedido.acao.EnviarEmailPedido;
import br.com.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	/**
	 * 
	 * @param args
	 * @implNote aplicar pattern Command, utilizar lógica para que sempre esteja atualizando a geracao de pedido
	 */
	public static void main(String[] args) {

		//Teste com a classe geraPedido
		String cliente = "Brendon"; //Informar cliente
		BigDecimal valorOrcamento = new BigDecimal("850"); //informar orcamento
		int quantidadeItens = Integer.parseInt("6"); //converter String para número
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(),
						new EnviarEmailPedido()));
		handler.executa(gerador);
	}

}
