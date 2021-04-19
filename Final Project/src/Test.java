import java.io.IOException;
import java.util.ArrayList;

public class Test
{	

	public static void main(String[] args) throws IOException, InvalidEmailException, InvalidPasswordException, UserAlreadySignedUpException
	{
		Student s1 = new Student("Mohamad", "Khalifeh", "mohamad.khalifeh03@lau.edu", "202000865");
		Student s2 = new Student("ALi", "solh", "ali.solh@lau.edu", "202002432");
		Student s3 = new Student("Rani", "Salman", "rani.salman@lau.edu", "202021235");
		Instructor i = new Instructor("Azzam","Mourad","azzam.mourad@lau.edu", "3214231243");
		UsersTextFile.addUser(s1);
		UsersTextFile.addUser(s2);
		UsersTextFile.addUser(s3);
		UsersTextFile.addUser(i);
		ArrayList<LauUser> lauUsers = UsersTextFile.getUsers();
		System.out.println(lauUsers);
	}	
}