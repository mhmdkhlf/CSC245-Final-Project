
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import users.Student;

@SuppressWarnings("serial")
public class StudentHomePage extends BlackBoardHomePage{
	private Student student;
	private JButton goToGpaCalculator;
	
	public StudentHomePage(Student student) {
		super(student);
		setStudent(student);
		announcementAction.setText("View annoucements");
		assignmentAction.setText("View assignments");
		courseAction.setText("Add/Drop courses");
		
		ImageIcon image = new ImageIcon("Gpa_Calculator_Logo.png");
		goToGpaCalculator = new JButton(image);
		goToGpaCalculator.setBounds(0, 0, 50, 50);
		goToGpaCalculator.addActionListener(this);
		this.add(goToGpaCalculator);
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
		if (click.getSource() == goToGpaCalculator)
			new GPACalculatorPage(student, this);
	}
}
