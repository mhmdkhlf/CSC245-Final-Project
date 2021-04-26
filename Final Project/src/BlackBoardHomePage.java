
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import users.*;

@SuppressWarnings("serial")
public class BlackBoardHomePage extends JFrame implements ActionListener {
	private JButton courseAction, announcementAction, assignmentAction;
	private JLabel welcomeLabel;
	
	public BlackBoardHomePage(LauUser user){
		this.setTitle("BlackBoard home page");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(470, 270);
		this.setLayout(null);
		ImageIcon image = new ImageIcon("lau-logo.jpg");
		this.setIconImage(image.getImage());
		
		String welcomeMessage = String.format("Welcome %s %s", user.getFirstName(), user.getLastName());
		welcomeLabel = new JLabel(welcomeMessage);
		welcomeLabel.setBounds(165, 10, 200, 25);
		this.add(welcomeLabel);
		
		assignmentAction = new JButton();
		assignmentAction.setBounds(65, 60, 150, 60);
		assignmentAction.addActionListener(this);
		this.add(assignmentAction);
		
		announcementAction = new JButton();
		announcementAction.setBounds(245, 60, 150, 60);
		announcementAction.addActionListener(this);
		this.add(announcementAction);
		
		courseAction = new JButton();
		courseAction.setBounds(155, 140, 150, 60);
		courseAction.addActionListener(this);
		this.add(courseAction);
		
		if (user instanceof Student) {
			announcementAction.setText("View annoucements");
			assignmentAction.setText("View assignments");
			courseAction.setText("Enroll/Drop courses");
		}
		else {
			announcementAction.setText("Add annoucement");
			assignmentAction.setText("Add assignment");
			courseAction.setText("Teach course");
		}
		
		this.setVisible(true);
	 }

	public void actionPerformed(ActionEvent click) {
		if (click.getSource() == assignmentAction) {
			// in case of Student open new frame that displays all assignments
			// in case of Instructor open new frame to create new assignment for course
		}
		if (click.getSource() == announcementAction) {
			// in case of Student open new frame that displays all announcements
			// in case of Instructor open new frame to create new announcement for course
		}
		if (click.getSource() == courseAction) {
			// in case of Student open new frame with check boxes for courses to register or drop
			// in case of Instructor open new frame to select only once the course to teach
		}
	}
}
