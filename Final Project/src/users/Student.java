package users;

import exceptions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import blackBoardClasses.*;

public class Student extends LauUser{
	private LinkedList<Course> registeredCourses = new LinkedList<Course>();
	
	public Student(){
		super();
	}
	public Student(String firstName, String lastName, String email, String password) 
			throws InvalidEmailException, InvalidPasswordException, ContainsSpaceException, NameTooShortException{
		super(firstName, lastName, email, password);
	}
	
	public LinkedList<Course> getRegisteredCourses() {
		return registeredCourses;
	}
	public void addCourse(Course course) {
		registeredCourses.add(course);
		course.AddStudent(this);
	}
	public void removeCourse(Course course) {
		for (Course search : registeredCourses)
			if (search.equals(course))
				registeredCourses.remove(course);
		course.removeStudent(this);
	}
	
	// Getting all the announcements of the student and,
	// sorting the announcements in a way to view the most recently published announcement first 
	public LinkedList<Announcement> viewAllAnnouncements() {
		LinkedList<Announcement> announcements = new LinkedList<Announcement>();
		ListIterator<Announcement> listIter;
		for (Course course : registeredCourses) {
			for(Announcement announcement : course.getAnnouncements()) {
				listIter = announcements.listIterator();
				boolean brokeLoop = false;
				while(listIter.hasNext()) {
					if(announcement.compareTo(listIter.next()) > 0) {
						listIter.previous();
						listIter.add(announcement);
						brokeLoop = true;
						break;
					}
				}
				if(!brokeLoop) listIter.add(announcement);
			}
		}
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
