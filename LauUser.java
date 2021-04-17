
public abstract class LauUser {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public LauUser(String firstName, String lastName, String email, String password) {
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
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isValidMail() {
		return email.contains("@lau.edu");
	} 
	public boolean isValidPassword() {
		return true;
	}
	public String toString() {
		return String.format("%s %s %s %s",firstName, lastName, email, password);
	}

}
