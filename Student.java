
public class Student extends LauUser{
	
	private String idNumber;
	
	public Student(String firstName, String lastName, int age, String email, String idNumber) {
		super(firstName, lastName, age, email);
		setIdNumber(idNumber);
	}

	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public boolean isvalidID() {
	 	return idNumber.length()==9;
	}
	
	public String toString() {
		return super.toString() + String.format("\n%s\n", idNumber);
	}
}
