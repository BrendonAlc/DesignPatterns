package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando e-mail com dados do pedido1");
	}
}
