
public class Student extends LauUser{
	
	public Student(String firstName, String lastName, String email, String password) {
		super(firstName, lastName, email, password);
	}
	
	public String toString() {
		return String.format("Student %s", super.toString());
	}
}
