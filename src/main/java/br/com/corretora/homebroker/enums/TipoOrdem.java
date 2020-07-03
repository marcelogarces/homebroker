package br.com.corretora.homebroker.enums;

public enum TipoOrdem {
		
	COMPRA("Compra","/ativo/compra"),
	VENDA("Venda","/ativo/venda");

	private String descricao;
	private String recurso;
	
	TipoOrdem(String descricao,String recurso) {
		
		this.descricao = descricao;
		this.recurso = recurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}
}
