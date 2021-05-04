
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import javax.swing.*;
import blackBoardClasses.Announcement;
import users.Student;

@SuppressWarnings("serial")
public class ViewAnnouncementsPage extends JFrame {
	private StudentHomePage userHomePage;
	private Student student;
	private JScrollPane display;
	
	public ViewAnnouncementsPage(Student user, StudentHomePage homePage) {
		student = user;
		userHomePage = homePage;
		userHomePage.setVisible(false);
		
		this.setTitle("Announcements Page");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(330, 200);
		ImageIcon image = new ImageIcon("lau-logo.jpg");
		this.setIconImage(image.getImage());
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				userHomePage.setVisible(true);
		    }  
		});
		
		JTextArea textArea = new JTextArea();
		LinkedList<Announcement> announcements = student.viewAllAnnouncements();
		String output = "";
		for (Announcement announcement : announcements)
			output += (announcement.toString() + "\n");
        textArea.setText(output);
		display = new JScrollPane(textArea);
		this.getContentPane().add(display, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
