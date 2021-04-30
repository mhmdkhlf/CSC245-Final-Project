
import java.util.Scanner;
import blackBoardClasses.Announcement;
import exceptions.ContainsSpaceException;
import exceptions.InvalidEmailException;
import exceptions.InvalidPasswordException;
import exceptions.NameTooShortException;
import users.*;

public class tester {
	
	public static void main(String[] args) throws InvalidEmailException, InvalidPasswordException, ContainsSpaceException, NameTooShortException {
		Instructor i = new Instructor("Azzam", "Mourad", "moafds.fadsf@lau.edu","fsaadfsfads");
//		Student s = new Student("Mohamad", "Khalife", "moafds.fadsf@lau.edu","fsaadfsfads");
//		new StudentHomePage(s);
		new InstructorHomePage(i);
//		new CoursePage(i);
		Scanner sc = new Scanner(System.in);
		
		sc.nextLine();
//		System.out.println(i.getCourseTaught());
//		new AppServer();
		for(Announcement a : i.getCourseTaught().getAnnouncements()) {
			System.out.println(a);
		}
		sc.close();
	}

}
