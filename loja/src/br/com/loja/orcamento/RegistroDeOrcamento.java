package br.com.loja.orcamento;

import java.util.Map;

import br.com.loja.DomainException;
import br.com.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

	private HttpAdapter http;
	
	
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}



	public void registrar(Orcamento orcamento) {
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento não finalizado!");
		}
		
		//chamada HTTP para a API externa
		//URL Connection
		//HTTP CLient
		//lib Rest
		
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of( //map.of para utilizar várias instancias/parametros
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidadeDeItens()
				);
		http.post(url , dados);
	}
}
