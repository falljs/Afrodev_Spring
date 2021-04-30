package glsid.home.metier;


import glsid.home.Bank.entities.Post;
import glsid.home.Bank.entities.Profile;
import glsid.home.Bank.entities.Users;

public interface ImplementationRemote {
	public void  addUser(Users u);
	public void  addProfile(Profile p);
	public void addPost(Post pt);

}
