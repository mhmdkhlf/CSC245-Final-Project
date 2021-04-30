package blackBoardClasses;

public class Announcement {
	private String title;
	private String body;
	private String courseCode;
	
	public Announcement(String title, String body, String courseCode) {
		setTitle(title);
		setBody(body);
		setCourseCode(courseCode);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String toString() {
		return String.format("%s: %s\n%s", courseCode, title, body);
	}
}