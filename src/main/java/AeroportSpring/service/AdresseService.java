package AeroportSpring.service;

import AeroportSpring.entity.Adresse;
import AeroportSpring.repository.AdresseRepository;
import AeroportSpring.repository.PassagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdresseService {

	@Autowired
	private AdresseRepository adresseRepo;
	
//	@Autowired
//	private PassagerRepository passagerRepo;
	
	public boolean insert(Adresse a) {
		if (a.getAdresse()!=null && a.getVille()!=null && a.getCodePostal()!=null && a.getPays()!=null) {
			adresseRepo.save(a);
			return true;
		} else {
			return false;
		}	
	}
	
	public Adresse update(Adresse a) {
		Adresse adresse=null;
		boolean erreur = false;
		if(a.getAdresse()==null) {
			erreur=true;
		}
		if(a.getCodePostal()==null) {
			erreur=true;
		}
		if(a.getPays()==null) {
			erreur=true;
		}
		if(a.getVille()==null) {
			erreur=true;
		}
		adresse = adresseRepo.save(a);
		return adresse;
	}	
	
}
