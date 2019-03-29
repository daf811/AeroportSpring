package AeroportSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AeroportSpring.entity.Reservation;
import AeroportSpring.repository.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepo;
	
//	@Autowired
//	private ClientRepository clientRepo;
	
	public boolean insert(Reservation r) {
		if (r.getDate() != null && r.getId() != null) {
			reservationRepo.save(r);
			return true;
		} else {
			return false;
		}
	}

	public Reservation update(Reservation r) {
		Reservation reservation = null;
		boolean erreur = false;
		if (r.getDate() == null) {
			erreur = true;
		}
		if (r.getId() == null) {
			erreur = true;
		}
		reservation = reservationRepo.save(r);
		return reservation;
	}
	
//	public List<Reservation> findByClient(Client client) {
//		return reservationRepo.findBy
//	}
	
}
