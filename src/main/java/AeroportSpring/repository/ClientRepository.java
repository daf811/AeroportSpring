package AeroportSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.entity.Client;

public interface ClientRepository extends JpaRepository<Client,Integer> {

}
