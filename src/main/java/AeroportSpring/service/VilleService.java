package AeroportSpring.service;

import org.springframework.beans.factory.annotation.Autowired;

import AeroportSpring.entity.Ville;
import AeroportSpring.repository.VilleRepository;

public class VilleService {

	@Autowired
	private VilleRepository villeRepo;
	
	public boolean insert(Ville ville) {
		if(ville.getNom() !=null) {
			villeRepo.save(ville);
			return true;
		}	else {
			return false;
		}
	}
	
	public Ville update(Ville v) {
		Ville ville = null;
		villeRepo.save(v);
		return ville;
	}
}
