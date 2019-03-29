package AeroportSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import AeroportSpring.entity.Passager;
import AeroportSpring.repository.PassagerRepository;
import AeroportSpring.repository.ReservationRepository;

@Service
public class PassagerService {
	
	@Autowired
	private PassagerRepository passagerRepo;

//	@Autowired
//	private ReservationRepository reservationRepo;

	public boolean insert(Passager passager) {
		if (passager.getPrenom() != null && passager.getNom() != null) {
			passagerRepo.save(passager);
			return true;
		} else {
			return false;
		}
	}

	public Passager update(Passager p) {
		Passager passager = null;
		boolean erreur = false;
		if (p.getPrenom() == null) {
			erreur = true;
		}
		if (p.getNom() == null) {
			erreur = true;
		}
		passager = passagerRepo.save(p);
		return passager;
	}
	
}

