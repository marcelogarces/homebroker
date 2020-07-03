package br.com.corretora.homebroker.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.corretora.homebroker.dto.OrdemCompraVenda;

@FeignClient("ibovespa")
public interface IbovespaClient {
	
	@RequestMapping(method = RequestMethod.POST,value = "/ordem/ativo/compra")
	public void enviarOrdem(OrdemCompraVenda ordemCompraVenda);

}
