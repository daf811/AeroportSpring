package AeroportSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.entity.Login;

public interface LoginRepository extends JpaRepository<Login,Integer> {

}
