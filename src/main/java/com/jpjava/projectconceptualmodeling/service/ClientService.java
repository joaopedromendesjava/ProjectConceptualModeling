package com.jpjava.projectconceptualmodeling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpjava.projectconceptualmodeling.model.Client;
import com.jpjava.projectconceptualmodeling.repository.ClientRepository;
import com.jpjava.projectconceptualmodeling.service.exceptions.ObjectNotFoundExecption;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public Client findClient(Long id) {
		
		Client client = clientRepository.findByClient(id);
		
		if(client == null) {
			
			throw new ObjectNotFoundExecption("Objeto não encontrado " + id + " Tipo " + 
					Client.class.getSimpleName());
			}
		
		return client;
	}
}
