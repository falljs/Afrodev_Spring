package glsid.home.Bank.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestParam; 

import glsid.home.Bank.dao.PostRepository;
import glsid.home.Bank.dao.ProfileRepository;
import glsid.home.Bank.dao.UsersRepository;
import glsid.home.Bank.entities.Post;
import glsid.home.Bank.entities.Profile;
import glsid.home.Bank.entities.Users;
import glsid.home.Bank.services.UsersService;
import glsid.home.Bank.validator.UserValidator;

/*@RequestMapping("/employee-module/addNew")
@SessionAttributes("users")*/
@Controller
@ComponentScan

public class AppController {
	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private UsersService usersService;
	@Autowired
	private ProfileRepository profileRepository;
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private UserValidator userValidator;

	//HOME PAGE
	@GetMapping("/")
	public String viewHomePage() {
		return "index";
	}
	// CREATION DE COMPTE UTILISATEUR
	@GetMapping(value="/register")
	public String showRegistrationForm(Model model) {
		Users users=new Users();
		model.addAttribute("users", users);
		return "register";
	}
	// VALIDATION
	@PostMapping("/register")
	public String registration(@ModelAttribute("users") Users users, BindingResult bindingResult) {
		userValidator.validate(users, bindingResult);

		if (bindingResult.hasErrors()) {
			return "/register";
		}
			usersService.save(users);
			//Security Service
		return "/profile";
	}
	// CREATION DE PROFILE
		@PostMapping("/profile") 
		public String submitForm(@ModelAttribute("profile") Profile profile) { 
			System.out.println(profile);

			return"create-profile";
		}
	// LOGIN
	@GetMapping(value="/login")
	public String showLoginForm(Model model) {
		model.addAttribute("users", new Users());
		return "loggin";
	}

	/*
	 * @GetMapping("/login") public String login(Model model, String error, String
	 * logout) { if (error != null) model.addAttribute("error",
	 * "Your username and password is invalid.");
	 * 
	 * if (logout != null) model.addAttribute("message",
	 * "You have been logged out successfully.");
	 * 
	 * return "login"; }
	 */
	// USER ESPACE
	@GetMapping(value="/dashboard")
	public String showDashboard(Model model) {
		model.addAttribute("users", new Users());
		return "dashboard";
	}
	// LISTE DES DEVELOPPEURS
	@GetMapping("/profiles")
	public String showProfilesPage(Model model) {
		Profile profile=new Profile();
		model.addAttribute("profile", profile);
		return "profiles";
	}
	// LES POSTS
	@GetMapping("/post")
	public String showPostPage(Model model) {
		Post post=new Post();
		model.addAttribute("post", post);
		return "posts";
	}
	
	/*
	 * @PostMapping("/process_register") public String processRegister(Users users)
	 * {
	 * 
	 * BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); String
	 * encodedPassword = passwordEncoder.encode(users.getPassword());
	 * users.setPassword(encodedPassword); usersRepository.save(users); return
	 * "register_success";
	 * 
	 * }
	 */
	/*
	 * @RequestMapping(value = "/add", method = RequestMethod.POST) public
	 * ModelAndView saveContact(
	 * 
	 * @RequestParam("prenom") String prenom,
	 * 
	 * @RequestParam("nom") String nom,
	 * 
	 * @RequestParam("username") String username,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("password") String password
	 * 
	 * ) {
	 * 
	 * Users users = new Users(); users.setPrenom(prenom); users.setNom(nom);
	 * users.setUsername(username); users.setEmail(email);
	 * users.setPassword(password);
	 * 
	 * usersRepository.createUser(users); return new
	 * ModelAndView("redirect:/profile"); }
	 */
}