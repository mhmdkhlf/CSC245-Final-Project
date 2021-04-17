
public class Instructor extends LauUser {
	
	private String socialSecurityNumber;
	
	public Instructor(String firstName, String lastName, int age, String email, String socialSecurityNumber) {
		super(firstName, lastName, age, email);
		setSocialSecurityNumber(socialSecurityNumber);
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String toString() {
		return super.toString() + String.format("\n%s\n", socialSecurityNumber);
	}
}
