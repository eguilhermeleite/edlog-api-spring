package com.edlog.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.edlog.api.domain.Client;
import com.edlog.api.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	// salvar cliente C
	public Client create(Client client) {
		return clientRepository.save(client);
	}//

	// listar todos R
	public List<Client> read() {
		return clientRepository.findAll();
	}//

	// pesquisar por id
	public ResponseEntity<Client> readById(Long id) {
		return clientRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}//

	// editar cliente U
	public ResponseEntity<Client> update(Long id, Client client) {
		if (!clientRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		client.setId(id);
		client = clientRepository.save(client);
		return ResponseEntity.ok(client);
	}//
	
	// deletar cliente D
	public ResponseEntity<Void> delete(Long id){
		if (!clientRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		clientRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}//

}//
