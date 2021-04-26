package users;

import exceptions.*;

import java.util.ArrayList;

import blackBoardClasses.*;

public class Student extends LauUser{
	private ArrayList<Course> registeredCourses;
	
	public Student(){
		super();
	}
	public Student(String firstName, String lastName, String email, String password) 
			throws InvalidEmailException, InvalidPasswordException, ContainsSpaceException, NameTooShortException{
		super(firstName, lastName, email, password);
	}
	
	public ArrayList<Course> getRegisteredCourses() {
		return registeredCourses;
	}
	public void AddCourse(Course course) {
		registeredCourses.add(course);
		course.AddStudent(this);
	}
	public void removeCourse(Course course) {
		for (Course search: registeredCourses) {
			if (search.equals(course)) {
				registeredCourses.remove(course);
			}
		}
		course.removeStudent(this);
	}
	public ArrayList<Announcement> viewAllAnnouncements(){
		ArrayList<Announcement> announcements = new ArrayList<Announcement>();
		for (Course course : registeredCourses) 
			announcements.addAll(course.getAnnouncements());
		return announcements;
	}
	public ArrayList<Assignment> viewAllAssignments() {
		ArrayList<Assignment> assignments = new ArrayList<Assignment>();
		for (Course course : registeredCourses) 
			assignments.addAll(course.getAssignments());
		return assignments;
	}
	public String toString() {
		return String.format("Student %s", super.toString());
	}
}
