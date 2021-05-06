
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import blackBoardClasses.Assignment;
import users.Instructor;

@SuppressWarnings("serial")
public class CreateAssignmentPage extends JFrame implements ActionListener {
	private Instructor instructor;
	private InstructorHomePage userHomePage;
	private JLabel title, instructions, dueDate;
	private JTextField assignmentTitleInput, dueDateInput;
	private JTextArea assignmentInstructionsInput;
	private JButton publishButton; 
	
	
	public CreateAssignmentPage(Instructor instructor, InstructorHomePage homePage) {
		setInstructor(instructor);
		userHomePage = homePage;
		userHomePage.setVisible(false);
		
		this.setTitle("Add assignment page");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(285, 440);
		this.setLayout(null);
		ImageIcon image = new ImageIcon("lau-logo.jpg");
		this.setIconImage(image.getImage());
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				userHomePage.setVisible(true);
		    }  
		});
		
		this.setVisible(true);
		
		title = new JLabel("Title:");
		title.setBounds(25, 5, 40, 30);
		assignmentTitleInput = new JTextField();
		assignmentTitleInput.setBounds(60, 5, 155, 25);
		this.add(title);
		this.add(assignmentTitleInput);
		
		instructions = new JLabel("Assignment Instructions", SwingConstants.CENTER);
		instructions.setBounds(0, 40, 260, 30);
		assignmentInstructionsInput = new JTextArea();
		assignmentInstructionsInput.setBounds(10, 70, 250, 230);
		this.add(instructions);
		this.add(assignmentInstructionsInput);
		
		dueDate = new JLabel("Due Date:");
		dueDate.setBounds(20, 310, 300, 30);
		dueDateInput = new JTextField();
		dueDateInput.setBounds(80, 310, 115, 30);
		this.add(dueDate);
		this.add(dueDateInput);
		
		publishButton = new JButton("Publish assignment");
		publishButton.setBounds(50, 350, 170, 35);
		publishButton.addActionListener(this);
		this.add(publishButton);
	}

	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
		
	public void actionPerformed(ActionEvent click) {
		if (click.getSource() == publishButton) {
			String title = assignmentTitleInput.getText();
			String instructions = assignmentInstructionsInput.getText();
			String courseCode = instructor.getCourseTaught().getCourseCode();
			String dueDate = dueDateInput.getText();
			instructor.addAssignment(new Assignment(title, instructions, dueDate,courseCode));
			userHomePage.successfullPublish.setText("Assignment published successfully!");
			this.dispose();
			userHomePage.setVisible(true);
		}
	}
}