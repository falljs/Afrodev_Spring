/*
 * package glsid.home.Bank.Test;
 * 
 * import static org.junit.Assert.assertThat; import static
 * org.junit.jupiter.api.Assertions.*; import javax.persistence.EntityManager;
 * import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * glsid.home.Bank.dao.UserRepository; import glsid.home.Bank.entities.User;
 * 
 * 
 * 
 * @DataJpaTest
 * 
 * @AutoConfigureTestDatabase(replace = Replace.NONE)
 * 
 * @Rollback(false) public class UserRepositoryTests {
 * 
 * @Autowired private EntityManager entityManager;
 * 
 * @Autowired private UserRepository repo;
 * 
 * @Test public void testCreateUser() { User user = new User();
 * user.setEmail("ravikumar@gmail.com"); user.setPassword("ravi2020");
 * user.setFirstName("Ravi"); user.setLastName("Kumar"); User savedUser =
 * repo.save(user); User existUser = entityManager.find(User.class,
 * savedUser.getId());
 * //assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
 * 
 * }
 * 
 * }
 */