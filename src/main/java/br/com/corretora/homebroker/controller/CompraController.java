package br.com.corretora.homebroker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.corretora.homebroker.dto.OrdemDTO;
import br.com.corretora.homebroker.enums.TipoOrdem;
import br.com.corretora.homebroker.service.IbovespaService;

@RestController
public class CompraController {
	
	
	@Autowired
	private IbovespaService ibovespaService;
	
	
	
	@RequestMapping(value = "/acoes/compra",method = RequestMethod.POST)
	public void realizarCompra(@RequestBody OrdemDTO compra) {
		
		ibovespaService.enviarOrdem(compra,TipoOrdem.COMPRA);
	
	}
	
	@CrossOrigin(origins = "http://localhost:4200") //anotação para angular chamar host diferente, por segurança o browser não permite
	@RequestMapping(value = "/ordens/{cpf}",method = RequestMethod.GET)
	@ResponseBody
	public List<OrdemDTO> listarOrdensPorCPF(@PathVariable String cpf) {
		
		return ibovespaService.listarOrdensPorCPF(cpf);
	
	}
}
