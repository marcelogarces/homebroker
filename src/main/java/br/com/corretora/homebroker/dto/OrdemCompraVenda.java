package br.com.corretora.homebroker.dto;

public interface OrdemCompraVenda {
	
	public String getCodigoAtivo();
	
	public void setCodigoAtivo(String codigoAtivo);
	
	public Integer getQuantidade();
	
	public void setQuantidade(Integer quantidade);

	public Double getPreco();
	
	public void setPreco(Double preco);
	
}
