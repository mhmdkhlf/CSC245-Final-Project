package Users;

import Exceptions.InvalidEmailException;
import Exceptions.InvalidPasswordException;

public class Student extends LauUser{
	
	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}
	public Student(String firstName, String lastName, String email, String password) 
			throws InvalidEmailException, InvalidPasswordException {
		super(firstName, lastName, email, password);
	}
	public String toString() {
		return String.format("Student %s", super.toString());
	}
	
}
