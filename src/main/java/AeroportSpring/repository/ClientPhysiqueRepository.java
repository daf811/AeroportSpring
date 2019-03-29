package AeroportSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.entity.Client;
import AeroportSpring.entity.ClientPhysique;

public interface ClientPhysiqueRepository extends JpaRepository<ClientPhysique,Integer>  {

}
