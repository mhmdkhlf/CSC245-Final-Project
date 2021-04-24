package ConsoleSimulations;

import java.io.IOException;
import java.util.Scanner;
import Exceptions.*;
import Users.LauUser;
import UsersTextFile.UsersTextFile;

public class LogInSimulation {
	
    public static void main(String[] args)
    		throws IOException, InvalidEmailException, InvalidPasswordException, ContainsSpaceException, NameTooShortException 
    {
    	boolean loggedIn = false;
    	do {
    		Scanner sc = new Scanner(System.in);
            System.out.print("Email: ");
            String email= sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();
    		try {
                LauUser user = UsersTextFile.getUser(email, password);
                System.out.printf("Welcome %s %s (%s)\n", user.getFirstName(), user.getLastName(), user.getClass());
                loggedIn = true;
                sc.close();
    		}
    		catch(UserNotFoundException e){
    			System.out.println("Invalid username/password");
    		}
    	}while(!loggedIn);        
    }
}
