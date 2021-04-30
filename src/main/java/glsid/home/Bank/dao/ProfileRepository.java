package glsid.home.Bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import glsid.home.Bank.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
