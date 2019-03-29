package AeroportSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.entity.Client;
import AeroportSpring.entity.ClientEl;

public interface ClientElRepository  extends JpaRepository<ClientEl,Integer>  {

}
