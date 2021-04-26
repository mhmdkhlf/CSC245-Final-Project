import exceptions.ContainsSpaceException;
import exceptions.InvalidEmailException;
import exceptions.InvalidPasswordException;
import exceptions.NameTooShortException;
import users.*;

public class Tester {
	
	public static void main(String[] args) throws InvalidEmailException, InvalidPasswordException, ContainsSpaceException, NameTooShortException {
		Instructor i = new Instructor("Mohamad", "Khalife", "moafds.fadsf@lau.edu","fsaadfsfads");
		Student s = new Student("Mohamad", "Khalife", "moafds.fadsf@lau.edu","fsaadfsfads");
		new BlackBoardHomePage(s);
		new BlackBoardHomePage(i);
//		new AppServer();
	}

}
