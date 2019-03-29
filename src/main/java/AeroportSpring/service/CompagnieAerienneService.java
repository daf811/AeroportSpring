package AeroportSpring.service;

import org.springframework.beans.factory.annotation.Autowired;

import AeroportSpring.entity.CompagnieAerienne;
import AeroportSpring.repository.CompagnieAerienneRepository;

public class CompagnieAerienneService {
	
	@Autowired
	private CompagnieAerienneRepository compagnieAerienneRepo;
	
	public boolean insert(CompagnieAerienne compagnieAerienne) {
		if (compagnieAerienne.getNom() !=null) {
			compagnieAerienneRepo.save(compagnieAerienne);
			return true;
		}	else {
			return false;
		}
	}
	
	public CompagnieAerienne update(CompagnieAerienne ca) {
		CompagnieAerienne compagnieAerienne = null;
		compagnieAerienneRepo.save(ca);
		return compagnieAerienne;
	}

}
