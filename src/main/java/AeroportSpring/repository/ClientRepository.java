package AeroportSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.entity.Client;
import AeroportSpring.entity.ClientEl;
import AeroportSpring.entity.ClientMoral;
import AeroportSpring.entity.ClientPhysique;

public interface ClientRepository extends JpaRepository<Client,Integer> {	
}
