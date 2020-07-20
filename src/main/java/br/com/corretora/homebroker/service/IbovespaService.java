package br.com.corretora.homebroker.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import br.com.corretora.homebroker.dto.InfoOrdemDTO;
*/

import br.com.corretora.homebroker.client.IbovespaClient;
import br.com.corretora.homebroker.dto.OrdemDTO;
import br.com.corretora.homebroker.enums.TipoOrdem;

@Service
public class IbovespaService {
	
	private static final Logger LOG = LoggerFactory.getLogger(IbovespaService.class);

	
	@Autowired
	private IbovespaClient ibovespaClient;
	
	
	public void enviarOrdem(OrdemDTO ordemCompraVenda,TipoOrdem tipoOrdem) {
		
		LOG.info("Enviando ordem de "+ tipoOrdem.getDescricao()+"para Ibovespa");
		ibovespaClient.enviarOrdem(ordemCompraVenda);
	}
	
	public List<OrdemDTO> listarOrdensPorCPF(String cpf) {
		
		return ibovespaClient.listarOrdensPorCPF(cpf);
	}
	
	
	
	/*
	 aqui já temos o loadbalance funcionando
	 o ribbon irá escolher a instância 
	@Autowired
	private RestTemplate client; 
  
	  
	 
	@Autowired
	private DiscoveryClient eurekaClient;
	
	
	public void enviarOrdem(OrdemCompraVenda ordemCompraVenda,TipoOrdem tipoOrdem) {
		
		
		HttpEntity<OrdemCompraVenda> requestEntity = new HttpEntity<>(ordemCompraVenda, null);

		
		client.exchange("http://ibovespa/ordem"+tipoOrdem.getRecurso(), HttpMethod.POST, 
				requestEntity, InfoOrdemDTO.class);
		
		//busco todas as instancias da app ibovespa no loadbalance 
		eurekaClient.getInstances("ibovespa").stream().forEach(ibovespa -> {
			System.out.println("localhost:" + ibovespa.getPort());
		});
		
		
	}
	 */
}
