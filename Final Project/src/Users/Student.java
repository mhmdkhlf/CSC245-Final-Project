package Users;

import BlackBoardClasses.*;
import java.util.ArrayList;
import Exceptions.*;

public class Student extends LauUser{
	private ArrayList<Course> courses;
	
	public Student(){
		super();
	}
	public Student(String firstName, String lastName, String email, String password) 
			throws InvalidEmailException, InvalidPasswordException, ContainsSpaceException, NameTooShortException{
		super(firstName, lastName, email, password);
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	public void AddCourse(String title, String courseNumber, int creditHours, Instructor instructor) 
//			throws CourseAlreadyregisteredException
	{
//		for (Course c:courses) {
//			if (c.getTitle().equals(title) && c.getCourseNumber().equals(courseNumber)&& c.getCreditHours()==creditHours) {
//				throw new CourseAlreadyregisteredException("You are already enrolled in the course.");
//			}
//		}
		Course c1 = new Course(title,courseNumber,creditHours);
		courses.add(c1);
		
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
