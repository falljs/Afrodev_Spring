package glsid.home.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import glsid.home.Bank.dao.ProfileRepository;
import glsid.home.Bank.dao.UsersRepository;


import glsid.home.Bank.entities.Profile;
/*import glsid.home.Bank.entities.Retrait;
import glsid.home.Bank.entities.User;*/
import glsid.home.Bank.entities.Users;

@SpringBootApplication
public class LaBankDuJsApplication implements CommandLineRunner{
	/*
	 * @Autowired ClientRepository clientRepository;
	 * 
	 * @Autowired UserRepository userRepository;
	 * 
	 * @Autowired CompteRepository compteRepository;
	 * 
	 * @Autowired OperationRepository operationRepository;
	 */
	@Autowired
	UsersRepository usersRepository;
	@Autowired
	ProfileRepository profileRepository;
	public static void main(String[] args) { 

		SpringApplication.run(LaBankDuJsApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Users users1=usersRepository.save(new Users(null, "Fatou", "Ka", "FKS",
		 * "fsk@gmail.com", "fhft45fjf")); Profile p1=profileRepository.save(new
		 * Profile(null, "AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG", "HHH", "III",
		 * "JJJ", "KKK", "LLL", users1));
		 */
		/*
		 * Client client1=clientRepository.save(new
		 * Client("M.Moustapha Fall","fallmoutapha1997@gmail.com")); Client
		 * client2=clientRepository.save(new
		 * Client("Ouseynou Job","sindidi@gmail.com")); Client
		 * client3=clientRepository.save(new
		 * Client("Khadim Seck","seckhadim73@gmail.com")); Client
		 * client4=clientRepository.save(new
		 * Client("Moustapha Sock","fallmoutapha1997@gmail.com"));
		 */

		/*
		 * User user1=userRepository.save(new User(null, "khassi@gmail.com", "khassi17",
		 * "Sokhna", "Job"));
		 * 
		 * Compte compte1=compteRepository.save(new CompteCourant("c1", new Date(),
		 * 10000.0, client1, 2000.0)); Compte compte2=compteRepository.save(new
		 * CompteEpargne("c2", new Date(), 25000.0, client2, 1000.0));
		 * 
		 * operationRepository.save(new Versement(new Date(), 2000.0, compte1));
		 * operationRepository.save(new Versement(new Date(), 1000.0, compte1));
		 * operationRepository.save(new Retrait(new Date(), 2500.0, compte1));
		 * 
		 * operationRepository.save(new Versement(new Date(), 30000.0, compte2));
		 * operationRepository.save(new Versement(new Date(), 4000.0, compte2));
		 * operationRepository.save(new Retrait(new Date(), 1100.0, compte2));
		 */
		
		

	}

	/*
	 * public static void main(String[] args) { ApplicationContext ctx=
	 * SpringApplication.run(LaBankDuJsApplication.class, args); ClientRepository
	 * clientRepository = ctx.getBean(ClientRepository.class);
	 * clientRepository.save(new Client("Moustapha","fallmoutapha1997@gmail.com"));
	 * }
	 */

}
