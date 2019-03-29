package AeroportSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AeroportSpring.entity.Ville;
import AeroportSpring.repository.VilleRepository;

@Service
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
	
	public Ville delete(Ville v) {
		Ville ville = null;
		villeRepo.delete(v);
		return ville;
	}
}
