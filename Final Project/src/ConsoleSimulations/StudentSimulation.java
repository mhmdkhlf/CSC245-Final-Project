//package ConsoleSimulations; 
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import Users.*;
//import BlackBoardClasses.*;
//import Exceptions.ContainsSpaceException;
//import Exceptions.InvalidEmailException;
//import Exceptions.InvalidPasswordException;
//import Exceptions.NameTooShortException;
//public class StudentSimulation {
//
//	public static void main(String[] args) throws InvalidEmailException, InvalidPasswordException, ContainsSpaceException, NameTooShortException {
//		// instructors
//		Instructor azzam = new Instructor();
//		Instructor tamara = new Instructor();
//		// courses
//		Course c1=new Course("cp2","245",3,azzam);
//		Course c2=new Course("eng","101",3,tamara);
//		//announcements of course cp2
//		Announcement ann1=new Announcement("Exam date","20.10.2021");
//		Announcement ann2=new Announcement("Exam grades","go to bb section grades");
//		ArrayList<Announcement> listann=new ArrayList<Announcement>();
//		listann.add(ann1);
//		listann.add(ann2);
//		// set
//		c1.setAnnouncements(listann);
//		// assignments of cp2
//		Assignment hw1=new Assignment("lab"," solve problems 1 2 3");
//		Assignment hw2=new Assignment("extra sheet","solve all exercises");
//		ArrayList<Assignment> listhw=new ArrayList<Assignment>();
//		listhw.add(hw1);
//		listhw.add(hw2);
//		// set
//		c1.setAssignments(listhw);
//		// announcements for eng101
//		Announcement ann11=new Announcement("webex session","join using link on bb");
//		Announcement ann22=new Announcement("summary quiz","review bb to prepare for the quiz");
//		ArrayList<Announcement> listann2=new ArrayList<Announcement>();
//		listann2.add(ann11);
//		listann2.add(ann22);
//		// set
//		c2.setAnnouncements(listann2);
//		// assignments for eng101
//		Assignment hw11=new Assignment("hw on book"," solve problems 11 12 13 page 111");
//		Assignment hw22=new Assignment("research paper","submit to turnit in");
//		ArrayList<Assignment> listhw2=new ArrayList<Assignment>();
//		listhw2.add(hw11);
//		listhw2.add(hw22);
//		//set
//		c2.setAssignments(listhw2);
//		//make a student
//		ArrayList<Course> listcourses=new ArrayList<Course>();
//			listcourses.add(c1);
//			listcourses.add(c2);
//		Student ali=new Student("ali","solh", "ali.fasfa@lau.edu","fasfadsfafds");
//		ali.setCourses(listcourses);
//		Scanner scan=new Scanner(System.in);
//		System.out.println("welcome Student.\nEnter veiwAnnouncements to show ur announcements\nEnter veiwAssignments to veiw your assignments\nEnter add to enroll in a course");
//		String command =scan.nextLine();
//		while (!(command.equalsIgnoreCase("veiwAnnouncements")|| command.equalsIgnoreCase("veiwAssignments")|| command.equalsIgnoreCase("add"))){
//			System.out.println("please Enter a valid command.");
//			command=scan.nextLine();
//		}
//		if (command.equalsIgnoreCase("veiwAnnouncements")) {
//			System.out.println("Here are all your Announcements:");
//			for (Announcement a:ali.VeiwAllAnnouncements()) {
//				System.out.println(a);
//			}
//		}else if (command.equalsIgnoreCase("veiwAssignments")) {
//			System.out.println("Here are all your homeworks");
//			for (Announcement a:ali.VeiwAllAnnouncements()) {
//				System.out.println(a);
//			}
//		}else if (command.equalsIgnoreCase("add")) {
//			boolean pass=false;
//			while (!pass) {
//				System.out.println("Enter the name of the course:");
//				String title=scan.nextLine();
//				System.out.println("Enter the number of the course:");
//				String number=scan.nextLine();
//				System.out.println("Enter the number of credits:");
//				int Crnumber =scan.nextInt();
//				scan.nextLine();
//				System.out.println("Enter the  first name of the instructor:");
//				String fname=scan.nextLine();
//				System.out.println("Enter the last name of the instructor:");
//				String lname=scan.nextLine();
//				Instructor ins=new Instructor();
////				try {
//					ali.AddCourse(title, number, Crnumber, ins);
//					pass=true;
//					System.out.println("Your course was added successfully");
////				} catch (CourseAlreadyregisteredException e) {
////					System.out.println(e.getMessage());
////				}
//
//			}
//
//		}
//
//	}
//
//}
