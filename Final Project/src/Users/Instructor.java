package Users;

import java.util.ArrayList;

import BlackBoardClasses.*;
import Exceptions.InvalidEmailException;
import Exceptions.InvalidPasswordException;

public class Instructor extends LauUser {
	private Course courseTaught;
	
	public Instructor(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public Instructor(String firstName, String lastName,String email, String password) 
			throws InvalidEmailException, InvalidPasswordException{
		super(firstName, lastName, email, password);
	}
	public Course getCourseTaught() {
		return courseTaught;
	}
	public void setCourseTaught(Course courseTaught) {
		this.courseTaught = courseTaught;
	}
	public void AddAnnouncement(Announcement announcement) {
		ArrayList<Announcement> newlist=courseTaught.getAnnouncements();
		newlist.add(announcement);
		courseTaught.setAnnouncements(newlist);
	}
	public void AddAssignment(Assignment assignment) {
		ArrayList<Assignment> newlist=courseTaught.getAssignments();
		newlist.add(assignment);
		courseTaught.setAssignments(newlist);
	}
	public String toString() {
		return String.format("Instructor %s", super.toString());
	}
	
}
