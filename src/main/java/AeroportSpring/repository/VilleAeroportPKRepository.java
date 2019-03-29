package AeroportSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.entity.Aeroport;
import AeroportSpring.entity.Ville;
import AeroportSpring.entity.VilleAeroportPk;

public interface VilleAeroportPKRepository extends JpaRepository<Ville, Aeroport>{

}
