
//import java.util.Scanner;
//import blackBoardClasses.*;
import exceptions.ContainsSpaceException;
import exceptions.InvalidEmailException;
import exceptions.InvalidPasswordException;
import exceptions.NameTooShortException;
import users.*;

public class tester {
	
	public static void main(String[] args) throws InvalidEmailException, InvalidPasswordException, ContainsSpaceException, NameTooShortException {
		Instructor i = new Instructor("Azzam", "Mourad", "moafds.fadsf@lau.edu","fsaadfsfads");
		new InstructorHomePage(i);

		Student s = new Student("Mohamad", "Khalife", "moafds.fadsf@lau.edu","fsaadfsfads");
		new StudentHomePage(s);
		
		//new AppServer(); start point of application
		
//		Scanner sc = new Scanner(System.in);
//		sc.nextLine();
//		System.out.println(s.getRegisteredCourses());
//		sc.nextLine();
//		System.out.println(s.getRegisteredCourses());
//		sc.close();
	}

}
