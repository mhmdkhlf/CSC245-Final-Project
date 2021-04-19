package Users;

import Exceptions.InvalidEmailException;
import Exceptions.InvalidPasswordException;

public class Instructor extends LauUser {
	
	public Instructor(String firstName, String lastName) {
		super(firstName, lastName);
	}
	public Instructor(String firstName, String lastName,String email, String password) 
			throws InvalidEmailException, InvalidPasswordException {
		super(firstName, lastName, email, password);
	}
	public String toString() {
		return String.format("Instructor %s", super.toString());
	}
	
}
