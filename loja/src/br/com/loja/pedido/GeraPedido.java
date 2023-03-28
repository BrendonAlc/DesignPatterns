package br.com.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.loja.orcamento.Orcamento;

public class GeraPedido {

	/**
	 * Criar atributos para saber de quem é o pedido
	 */
	
	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	
	//injecao de dependencias: PedidoRepository, EmailService, .....
	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
		super();
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}
	
	public void executa() {
		
	}

	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	
	
	
}
