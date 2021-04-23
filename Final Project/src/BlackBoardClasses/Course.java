package BlackBoardClasses;

import java.util.ArrayList;
import Users.*;

public class Course {
	private String title;
	private String courseNumber;
	private int creditHours;
	private Instructor instructor;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Announcement> announcements = new ArrayList<Announcement>();
	private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
	
	public Course(String title, String courseNumber, int creditHours, Instructor instructor) {
		setTitle(title);
		setCourseNumber(courseNumber);
		setCreditHours(creditHours);
		setInstructor(instructor);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}	
	public ArrayList<Announcement> getAnnouncements() {
		return announcements;
	}
	public void setAnnouncements(ArrayList<Announcement> announcements) {
		this.announcements = announcements;
	}
	public ArrayList<Assignment> getAssignments() {
		return assignments;
	}
	public void setAssignments(ArrayList<Assignment> assignments) {
		this.assignments = assignments;
	}
}