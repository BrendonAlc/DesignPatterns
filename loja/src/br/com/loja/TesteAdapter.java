package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.http.JavaHttpClient;
import br.com.loja.orcamento.Orcamento;
import br.com.loja.orcamento.RegistroDeOrcamento;

public class TesteAdapter {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient()); //Chamar a API JavaHttpClient
		registro.registrar(orcamento);

	}

}
