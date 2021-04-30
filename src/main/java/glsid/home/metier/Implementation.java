package glsid.home.metier;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import glsid.home.Bank.dao.UsersRepository;
/*import glsid.home.Bank.entities.Compte;*/
import glsid.home.Bank.entities.Post;
import glsid.home.Bank.entities.Profile;
import glsid.home.Bank.entities.Users;



public class Implementation implements ImplementationRemote {
	
	@Autowired
	private UsersRepository usersRepository;
    
	
	@Override
	public void addUser(Users u) {
		usersRepository.save(u);
		
	}

	@Override
	public void addProfile(Profile p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPost(Post pt) {
		// TODO Auto-generated method stub
		
	}
	
}
