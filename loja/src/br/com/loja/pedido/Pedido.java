package br.com.loja.pedido;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.loja.orcamento.Orcamento;

public class Pedido {

	private String cliente;
	private LocalDateTime data;
	private Orcamento orcamento;
	
	public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
		super();
		this.cliente = cliente;
		this.data = data;
		this.orcamento = orcamento;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public Orcamento getOrcamento() {
		return orcamento;
	}
	
}
