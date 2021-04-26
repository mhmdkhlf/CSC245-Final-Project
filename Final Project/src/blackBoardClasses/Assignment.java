package blackBoardClasses;

public class Assignment {
	private String title;
	private String instructions;
	private String courseCode;
	private String dueDate;
	
	public Assignment(String title, String instructions) {
		this.title = title;
		this.instructions = instructions;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String getDuedate() {
		return dueDate;
	}
	public void setDuedate(String duedate) {
		dueDate = duedate;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}