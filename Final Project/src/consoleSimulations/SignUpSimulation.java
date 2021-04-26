package consoleSimulations;

import java.io.IOException;
import java.util.Scanner;

import exceptions.*;
import users.*;
import usersTextFile.UsersTextFile;
public class SignUpSimulation {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean errors = false;
		LauUser s;
		do {
			boolean invalidMail = false;
			boolean invalidPassword = false;
			boolean signedUpAlready = false;
			System.out.print("First name: ");
			String Firstname = sc.nextLine();
			System.out.print("Last name: ");
			String Lastname = sc.nextLine();
			// use radio buttons to select type of user, all other input is just regular text box
			System.out.print("Student/ Instructor: ");
			String user = sc.nextLine();	
			//
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Password: ");
			String password = sc.nextLine();
			if(user.equals("s"))
				s  = new Student();
			else 
				s = new Instructor(); 
			try {
				s.setFirstName(Firstname);
				s.setLastName(Lastname);
			}
			catch(ContainsSpaceException e) {
				System.out.println("First/Last name can't contain spaces");
			}
			catch(NameTooShortException e) {
				System.out.println(e.getMessage());
			}
			try {
				s.setEmail(email);
			}
			catch(InvalidEmailException e) {
				System.out.println("\n****Your email is not a valid LAU email****\n");
				invalidMail = true;
			}
			try {
				s.setPassword(password);
			}
			catch (InvalidPasswordException e){
				System.out.println("\n****Your password should contain at least 8 characters****\n");
				invalidPassword = true;
			}
			catch (ContainsSpaceException e) {
				System.out.println("Password name can't contain spaces");
			}
			if(!invalidMail && !invalidPassword) {
				try {
					UsersTextFile.addUser(s);
					System.out.println("You finished the sign up process you can log in now");
				}
				catch (UserAlreadySignedUpException e){
					System.out.println("\n****This email is already being used****\n");
					signedUpAlready = true;
				}	
			}
			errors = invalidMail || invalidPassword || signedUpAlready;
		} while (errors);
		sc.close();
	}

}