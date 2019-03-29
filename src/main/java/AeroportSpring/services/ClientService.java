package AeroportSpring.services;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AeroportSpring.entity.Client;
import AeroportSpring.entity.ClientMoral;
import AeroportSpring.repository.ClientRepository;
import AeroportSpring.repository.LoginRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepo;

	public boolean insert(Client client) {
		if (client.getNom() != null) {
			clientRepo.save(client);
			return true;
		} else {
			return false;
		}
	}

	public Client update(Client c) {
		Client client = null;
		boolean erreur = false;
		if (c.getNom() == null) {
			erreur = true;
		}
		return client;
	}
	
	public Client delete(Client c) {
			Client client = null;
			boolean erreur = false;
			if (c.getNom() == null) {
				erreur = true;
			}

			client = clientRepo.save(c);
			return client;

		}

	}

