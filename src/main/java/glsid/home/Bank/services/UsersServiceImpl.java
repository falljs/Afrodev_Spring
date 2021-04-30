package glsid.home.Bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import glsid.home.Bank.dao.UsersRepository;
import glsid.home.Bank.entities.Users;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersRepository usersRepository;
	
	/*
	 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 */
	
	@Override
	public void save(Users users) {
		
		users.setPrenom(users.getPrenom());
		users.setNom(users.getNom());
		users.setUsername(users.getUsername());
		users.setEmail(users.getEmail());
		users.setPassword(users.getPassword());

		/* user.setRoles(new HashSet<>(roleRepository.findAll())); */
		usersRepository.save(users);
	
	}

	@Override
	public Users findByUsername(String Username) {
		// TODO Auto-generated method stub
		return null;
	}

}
