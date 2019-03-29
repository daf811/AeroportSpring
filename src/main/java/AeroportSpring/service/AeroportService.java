package AeroportSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AeroportSpring.entity.Aeroport;
import AeroportSpring.repository.AeroportRepository;

@Service
public class AeroportService {
	
	@Autowired
	private AeroportRepository aeroportRepo;
	
	public boolean insert(Aeroport aeroport) {
		if(aeroport.getNom() !=null) {
			aeroportRepo.save(aeroport);
			return true;
		} else {
			return false;
		}
	}
	
	public Aeroport update(Aeroport a) {
		Aeroport aeroport = null;
		aeroportRepo.save(a);
		return aeroport;
	}

}
