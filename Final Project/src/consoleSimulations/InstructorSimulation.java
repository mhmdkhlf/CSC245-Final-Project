package consoleSimulations;
//package ConsoleSimulations;
//
//import Users.*;
//import BlackBoardClasses.*;
//import java.util.Scanner;
//
//public class InstructorSimulation {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		Instructor i = new Instructor();
//		Course c = new Course("cp2","2", 3, i);
//		Announcement ann = new Announcement("", "");
//		Assignment ass = new Assignment("", "");
//		while(true) {
//			System.out.print("Enter the title of the new assignment: ");
//			String title = scanner.nextLine();
//			ass.setTitle(title);
//			System.out.print("Enter the instructin for the new assignment: ");
//			String instructions = scanner.nextLine();
//			ass.setInstructions(instructions);
//			System.out.println("Do you want to add another assignment? ");
//			String more = scanner.nextLine();
//			if(more.equals("no")) {
//				break;
//			}
//			while(!more.equals("yes") && !more.equals("no") ) {
//				System.out.println("Choose between yes and no only");
//				more = scanner.nextLine();
//				if(more == "no") {
//					break;
//				}
//			}
//		}
//		while(true) {
//			System.out.print("Enter the title of the new announcement: ");
//			String title = scanner.nextLine();
//			ann.setTitle(title);
//			System.out.print("Enter the content for the new announcemen: ");
//			String content = scanner.nextLine();
//			ann.setContent(content);
//			System.out.println("Do you want to add another assignment? ");
//			String more = scanner.nextLine();
//			if( more.equals("no")) {
//				break;
//			}
//			while(!more.equals("yes") && !more.equals("no")) {
//				System.out.println("Choose between yes and no only");
//				more = scanner.nextLine();
//				if(more == "no") {
//					break;
//				}
//			}
//		}
//		scanner.close();
//	}
//
//}
