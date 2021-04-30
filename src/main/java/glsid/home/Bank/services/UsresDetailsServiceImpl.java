/*
 * package glsid.home.Bank.services;
 * 
 * import java.util.HashSet; import java.util.Set;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.transaction.annotation.Transactional;
 * 
 * import glsid.home.Bank.dao.UsersRepository; import
 * glsid.home.Bank.entities.Profile; import glsid.home.Bank.entities.Users;
 * 
 * public class UsresDetailsServiceImpl implements UserDetailsService{
 * 
 * @Autowired private UsersRepository usersRepository;
 * 
 * @Override
 * 
 * @Transactional(readOnly = true) public UserDetails loadUserByUsername(String
 * username) throws UsernameNotFoundException { Users user =
 * usersRepository.findByUsername(username); if (user == null) throw new
 * UsernameNotFoundException(username);
 * 
 * Set<GrantedAuthority> grantedAuthorities = new HashSet<>(); for (Profile
 * profile : user.getProfile()){ grantedAuthorities.add(new
 * SimpleGrantedAuthority(profile.getStatu())); }
 * 
 * return new
 * org.springframework.security.core.userdetails.User(user.getUsername(),
 * user.getPassword(), grantedAuthorities); }
 * 
 * }
 */