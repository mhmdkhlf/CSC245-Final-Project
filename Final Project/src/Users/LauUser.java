package Users;

import Exceptions.InvalidEmailException;
import Exceptions.InvalidPasswordException;

public abstract class LauUser {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public LauUser(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	public LauUser(String firstName, String lastName, String email, String password)
			throws InvalidEmailException, InvalidPasswordException {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPassword(password);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws InvalidEmailException {
		if (email.matches("[a-z]+\\.[a-z0-9]+(@lau.edu)"))
			this.email = email;
		else
			throw new InvalidEmailException();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) throws InvalidPasswordException {
		if(password.length() >= 8)
			this.password = password;
		else
			throw new InvalidPasswordException();
	}
	public String toString() {
		return String.format("%s %s %s %s",firstName, lastName, email, password);
	}

}