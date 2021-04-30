		import java.awt.event.ActionEvent;

import users.Student;

@SuppressWarnings("serial")
public class StudentHomePage extends BlackBoardHomePage{
	private Student student;
	
	public StudentHomePage(Student student) {
		super(student);
		setStudent(student);
		announcementAction.setText("View annoucements");
		assignmentAction.setText("View assignments");
		courseAction.setText("Enroll/Drop courses");
	}

	public void actionPerformed(ActionEvent click) {
		if (click.getSource() == assignmentAction) {
			// open new frame that displays all assignments
		}
		if (click.getSource() == announcementAction) {
			// open new frame to create new announcement for course
		}
		if (click.getSource() == courseAction) {
			// open new frame with check boxes for courses to register or drop
		}
		
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
