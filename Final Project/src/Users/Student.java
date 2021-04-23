package Users;

import BlackBoardClasses.*;
import java.util.ArrayList;
import Exceptions.InvalidEmailException;
import Exceptions.InvalidPasswordException;

public class Student extends LauUser{
	private ArrayList<Course> courses;
	
	public Student(String firstName, String lastName){
		super(firstName, lastName);
	}
	public Student(String firstName, String lastName, String email, String password) 
			throws InvalidEmailException, InvalidPasswordException{
		super(firstName, lastName, email, password);
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	public ArrayList<Announcement> VeiwAllAnnouncements(){
		ArrayList<Announcement> announcements = new ArrayList<Announcement>();
		for (Course course : courses) 
			for (Announcement a : course.getAnnouncements())
				announcements.add(a);
		return announcements;
	}
	public ArrayList<Assignment> VeiwAllAssignments() {
		ArrayList<Assignment> assignments = new ArrayList<Assignment>();
		for (Course course : courses) 
			for (Assignment a : course.getAssignments())
				assignments.add(a);
		return assignments;
	}
	public String toString() {
		return String.format("Student %s", super.toString());
	}
}
