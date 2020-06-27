package br.com.corretora.homebroker.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.corretora.homebroker.compra.dto.CompraDTO;

@RestController
@RequestMapping("/acoes/compra")
public class CompraController {
	
	@RequestMapping(method = RequestMethod.POST)
	public void realizarCompra(@RequestBody CompraDTO compra) {
		
	}

}
