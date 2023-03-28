package br.com.loja;

/**
 * 
 * @author brend
 * @implNote Domain alterado para implementar padrão State no pacote orcamento.situacao
 */
public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DomainException(String mensagem) {
		super(mensagem);
	}
}
