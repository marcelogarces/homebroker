package br.com.corretora.homebroker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.corretora.homebroker.dto.CompraDTO;
import br.com.corretora.homebroker.enums.TipoOrdem;
import br.com.corretora.homebroker.service.IbovespaService;

@RestController
@RequestMapping("/acoes/compra")
public class CompraController {
	
	
	@Autowired
	private IbovespaService ibovespaService;
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public void realizarCompra(@RequestBody CompraDTO compra) {
		
		ibovespaService.enviarOrdem(compra,TipoOrdem.COMPRA);
	
	}
}
