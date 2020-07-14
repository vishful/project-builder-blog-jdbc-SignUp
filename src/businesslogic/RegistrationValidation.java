package businesslogic;

public class RegistrationValidation {
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		validEmail(email);
		validPassword(password, confirmPassword);
		return false;
	}
	private boolean validPassword(String password, String confirmPassword) {		
		if(((password!="") && (password==confirmPassword))&&(password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,20}$"))) {
			return true;
		}
		else
			return false;
	}
	private boolean validEmail(String email) {
		if(email.matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$")) {
			return true;
		}
		else
			return false;
	}
}