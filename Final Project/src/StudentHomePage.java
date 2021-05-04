
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
		courseAction.setText("Add/Drop courses");
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void actionPerformed(ActionEvent click) {
		if (click.getSource() == assignmentAction) 
			new ViewAssignmentsPage(student, this);
		if (click.getSource() == announcementAction) 
			new ViewAnnouncementsPage(student, this);
		if (click.getSource() == courseAction) 
			new RegistrationPage(student, this);
	}
}
