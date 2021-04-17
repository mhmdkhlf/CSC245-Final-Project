
public class Instructor extends LauUser {
	
	public Instructor(String firstName, String lastName,String email, String password) {
		super(firstName, lastName, email, password);
	}
	
	public String toString() {
		return String.format("Instructor %s", super.toString());
	}
}
