package AeroportSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AeroportSpring.entity.Vol;
import AeroportSpring.repository.VolRepository;

@Service
public class VolService {
		
	@Autowired
	private VolRepository volRepo;
	
	public boolean insert (Vol vol) {
		if(vol.getDepartVols() !=null && vol.getArriveeVols() !=null) {
			volRepo.save(vol);
			return true;
		} else {
			return false;
		}
	}
	
	public Vol update (Vol v) {
		Vol vol = null;
		volRepo.save(v);
		return vol;
	}
		
		
}
