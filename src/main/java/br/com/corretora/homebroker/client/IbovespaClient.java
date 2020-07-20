package br.com.corretora.homebroker.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.corretora.homebroker.dto.OrdemDTO;

@FeignClient("ibovespa")
public interface IbovespaClient {
	
	@RequestMapping(method = RequestMethod.POST,value = "/ordem/ativo/compra")
	public void enviarOrdem(OrdemDTO ordemCompraVenda);
	
	@RequestMapping(method = RequestMethod.GET,value = "/ordens/{cpf}")
	@ResponseBody
	public List<OrdemDTO> listarOrdensPorCPF(@PathVariable String cpf);
	

}
