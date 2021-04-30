package glsid.home.Bank.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import glsid.home.Bank.entities.Users;
import glsid.home.Bank.services.UsersService;

@Component
public class UserValidator implements Validator{
	@Autowired
	private UsersService usersService;

	@Override
	public boolean supports(Class<?> aClass) {
		return Users.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {

		Users user = (Users) o;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		if (user.getUsername().length() < 6 || user.getUsername().length() > 12) {
			errors.rejectValue("username", "Size.users.username");
		}
		if (usersService.findByUsername(user.getUsername()) != null) {
			errors.rejectValue("username", "Duplicate.users.username");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if (user.getPassword().length() < 8 || user.getPassword().length() > 10) {
			errors.rejectValue("password", "Size.users.password");
		}
						
		if (!user.getPasswordConfirm().equals(user.getPassword())) {
			errors.rejectValue("passwordConfirm", "Diff.users.passwordConfirm"); 
		}

	}
}