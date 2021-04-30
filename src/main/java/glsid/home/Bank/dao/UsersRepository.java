package glsid.home.Bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import glsid.home.Bank.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

	Users findByUsername(String username);	

}
