package br.com.adilsondjr.ossystem.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adilsondjr.ossystem.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@RequestMapping("/clientes")
	public List<Cliente> listar(){
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.setId(1L);
		c1.setName("Adilson");
		c1.setEmail("adilson@adilson.com");
		c1.setTelefone("35 99898-9191");
		
		c2.setId(2L);
		c2.setName("Alessandra");
		c2.setEmail("alessandra@alessandra.com.br");
		c2.setTelefone("35 99898-8484");
		
		return Arrays.asList(c1, c2);
	}

}
