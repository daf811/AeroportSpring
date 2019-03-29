package AeroportSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.entity.Client;
import AeroportSpring.entity.ClientMoral;

public interface ClientMoralRepository  extends JpaRepository<ClientMoral,Integer>  {

}
