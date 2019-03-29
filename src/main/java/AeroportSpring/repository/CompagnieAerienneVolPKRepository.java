package AeroportSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.entity.CompagnieAerienne;
import AeroportSpring.entity.CompagnieAerienneVolPK;
import AeroportSpring.entity.Vol;

public interface CompagnieAerienneVolPKRepository extends JpaRepository<Vol, CompagnieAerienne>{

}
