package AeroportSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AeroportSpring.entity.Client;
import AeroportSpring.entity.Login;
import AeroportSpring.repository.ClientRepository;
import AeroportSpring.repository.LoginRepository;

@Service
public class LoginService {

		@Autowired
		private LoginRepository loginRepo;

		public boolean insert(Login login) {
			if (login.getLogin() != null) {
				loginRepo.save(login);
				return true;
			} else {
				return false;
			}
		}

		public Client update(Login login) {
			Client client = null;
			boolean erreur = false;
			if (login.getLogin() == null) {
				erreur = true;
			}
			return client;
		}
		
		public Client delete(Login login) {
			loginRepo.delete(login);
			return null;
			}
		
		
}

