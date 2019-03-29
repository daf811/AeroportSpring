package AeroportSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.entity.Aeroport;
import AeroportSpring.entity.Vol;
import AeroportSpring.entity.VolAeroportPK;

public interface VolAeroportPKRepository extends JpaRepository<Vol, Aeroport>{

}
