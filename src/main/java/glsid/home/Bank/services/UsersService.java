package glsid.home.Bank.services;

import glsid.home.Bank.entities.Users;

public interface UsersService {
	void save(Users users);
	Users findByUsername(String Username);
}
