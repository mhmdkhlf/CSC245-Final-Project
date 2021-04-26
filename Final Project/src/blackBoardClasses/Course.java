package blackBoardClasses;

import java.util.ArrayList;

import users.*;

public class Course {
	private String title;
	private String courseCode;
	private int creditHours;
	private Instructor instructor;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Announcement> announcements = new ArrayList<Announcement>();
	private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
	
	public Course(String title, String courseCode, int creditHours) {
		setTitle(title);
		setCourseCode(courseCode);
		setCreditHours(creditHours);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseNumber) {
		this.courseCode = courseNumber;
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
	public void AddStudent(Student s) {
		students.add(s);
	}
	public void removeStudent(Student s) {
		for (Student student : students) 
			if (student.equals(s)) {
				students.remove(student);
				return;
				}
	}
	public ArrayList<Announcement> getAnnouncements() {
		return announcements;
	}
	public ArrayList<Assignment> getAssignments() {
		return assignments;
	}
	public void AddAssignment(Assignment A) {
		assignments.add(A);
	}
	public void AddAnnouncement(Announcement A) {
		announcements.add(A);
	}
	public String toString() {
		return String.format("%s: %s", courseCode, title);
	}
}