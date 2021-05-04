
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import blackBoardClasses.Assignment;
import javax.swing.*;
import users.Student;

@SuppressWarnings("serial")
public class ViewAssignmentsPage extends JFrame{
	private StudentHomePage userHomePage;
	private Student student;
	private JScrollPane display;
	
	public ViewAssignmentsPage(Student user, StudentHomePage homePage) {
		student = user;
		userHomePage = homePage;
		userHomePage.setVisible(false);
		
		this.setTitle("Announcements Page");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(330, 450);
		ImageIcon image = new ImageIcon("lau-logo.jpg");
		this.setIconImage(image.getImage());
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				userHomePage.setVisible(true);
		    }  
		});
		
		JTextArea textArea = new JTextArea();
		ArrayList<Assignment> assignments = student.viewAllAssignments();
		String output = "";
		for (Assignment a : assignments)
			output += (a.toString() + "\n");
		textArea.setText(output);
		display = new JScrollPane(textArea);
		this.getContentPane().add(display, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
