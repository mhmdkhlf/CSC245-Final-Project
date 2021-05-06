
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
import users.Instructor;

@SuppressWarnings("serial")
public class InstructorHomePage extends BlackBoardHomePage{
	protected JLabel teachingCourse, noCourseSelected, successfullPublish;
	private Instructor instructor;
	
	public InstructorHomePage(Instructor instructor) {
		super(instructor);
		setInstructor(instructor);
		announcementAction.setText("Add annoucement");
		assignmentAction.setText("Add assignment");
		courseAction.setText("Teach course");
		
		String course = (instructor.getCourseTaught() == null ? "\u2205" : instructor.getCourseTaught().toString());
		String courseTaught = String.format("Course taught: %s", course);
		teachingCourse = new JLabel(courseTaught, SwingConstants.CENTER);
		teachingCourse.setBounds(0, 220, 450, 25);
		this.add(teachingCourse);
		
		noCourseSelected= new JLabel("", SwingConstants.CENTER);
		noCourseSelected.setForeground(Color.red);
		noCourseSelected.setBounds(0, 120, 450, 30);
		this.add(noCourseSelected);
		
		successfullPublish = new JLabel("", SwingConstants.CENTER);
		successfullPublish.setForeground(Color.blue);
		successfullPublish.setBounds(0, 120, 450, 30);
		this.add(successfullPublish);
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	public void actionPerformed(ActionEvent click) {
		if (click.getSource() == assignmentAction) {
			if(instructor.getCourseTaught() != null) {
				new CreateAssignmentPage(instructor, this);
				noCourseSelected.setText("");
				successfullPublish.setText("");
			}
			else {
				noCourseSelected.setText("\u26a0 Must teach a course before adding assignment/annoucement");
			}
		}
		if (click.getSource() == announcementAction) {
			if(instructor.getCourseTaught() != null) {
				new CreateAnnouncementPage(instructor, this);
				noCourseSelected.setText("");
				successfullPublish.setText("");
			}
			else {
				noCourseSelected.setText("\u26a0 Must teach a course before adding assignment/annoucement");
			}
		}
		if (click.getSource() == courseAction) {
			new TeachCoursePage(instructor, this);
			successfullPublish.setText("");
		}
	}
}
