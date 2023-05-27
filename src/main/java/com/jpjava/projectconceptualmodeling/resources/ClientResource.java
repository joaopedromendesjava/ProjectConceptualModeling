package com.jpjava.projectconceptualmodeling.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpjava.projectconceptualmodeling.model.Client;
import com.jpjava.projectconceptualmodeling.service.ClientService;

@RestController
@RequestMapping(value = "/client")
public class ClientResource {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Long id){
	
		Client client = clientService.findClient(id);
		
		return ResponseEntity.ok(client);
	}

}
