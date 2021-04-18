import java.util.ArrayList;

public class Course {
	private String title;
	private String courseNumber;
	private int creditHours;
	private Instructor instructor;
	private ArrayList<Student> students;
	
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
	
}
