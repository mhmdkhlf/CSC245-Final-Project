
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import blackBoardClasses.CourseList;
import users.Student;

@SuppressWarnings("serial")
public class RegistrationPage extends JFrame implements ActionListener{
	private StudentHomePage userHomePage;
	private JLabel instruction;
	private JCheckBox[] coursesButtons = new JCheckBox[10];
	private JButton submitChangesButton;
	private Student student;
	
	public RegistrationPage (Student user, StudentHomePage homePage) {
		student = user;
		userHomePage = homePage;
		userHomePage.setVisible(false);
		
		this.setTitle("Add/Drop Course");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(330, 450);
		this.setLayout(null);
		ImageIcon image = new ImageIcon("lau-logo.jpg");
		this.setIconImage(image.getImage());
		
		instruction = new JLabel("Select to Add course | Deselect to Drop course", SwingConstants.CENTER);
		instruction.setBounds(0, 15, 320, 25);
		instruction.setFont(new Font("", Font.PLAIN, 13));
		this.add(instruction);
		
		JCheckBox course0 = new JCheckBox(CourseList.courses[0].toString());
		course0.setBounds(30, 50, 250, 20);
		JCheckBox course1 = new JCheckBox(CourseList.courses[1].toString());
		course1.setBounds(30, 80, 250, 20);
		JCheckBox course2 = new JCheckBox(CourseList.courses[2].toString());
		course2.setBounds(30, 110, 250, 20);
		JCheckBox course3 = new JCheckBox(CourseList.courses[3].toString());
		course3.setBounds(30, 140, 250, 20);
		JCheckBox course4 = new JCheckBox(CourseList.courses[4].toString());
		course4.setBounds(30, 170, 250, 20);
		JCheckBox course5 = new JCheckBox(CourseList.courses[5].toString());
		course5.setBounds(30, 200, 250, 20);
		JCheckBox course6 = new JCheckBox(CourseList.courses[6].toString());
		course6.setBounds(30, 230, 250, 20);
		JCheckBox course7 = new JCheckBox(CourseList.courses[7].toString());
		course7.setBounds(30, 260, 250, 20);
		JCheckBox course8 = new JCheckBox(CourseList.courses[8].toString());
		course8.setBounds(30, 290, 250, 20);
		JCheckBox course9 = new JCheckBox(CourseList.courses[9].toString());
		course9.setBounds(30, 320, 250, 20);
		this.add(course0); coursesButtons[0] = course0;
		this.add(course1); coursesButtons[1] = course1;
		this.add(course2); coursesButtons[2] = course2;
		this.add(course3); coursesButtons[3] = course3;
		this.add(course4); coursesButtons[4] = course4;
		this.add(course5); coursesButtons[5] = course5;
		this.add(course6); coursesButtons[6] = course6;
		this.add(course7); coursesButtons[7] = course7;
		this.add(course8); coursesButtons[8] = course8;
		this.add(course9); coursesButtons[9] = course9;
		
		for (int i=0; i < CourseList.courses.length; i++)
			if(student.getRegisteredCourses().contains(CourseList.courses[i]))
				coursesButtons[i].setSelected(true);
		
		submitChangesButton = new JButton("Submit Changes");
		submitChangesButton.setBounds(80, 360, 150, 35);
		submitChangesButton.addActionListener(this);
		this.add(submitChangesButton);
		
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent click) {
		if (click.getSource() == submitChangesButton)
		for (int i=0; i<10; i++) 
			if (coursesButtons[i].isSelected())
				student.addCourse(CourseList.courses[i]);
			else
				student.removeCourse(CourseList.courses[i]);
		this.dispose();
		userHomePage.setVisible(true);
	}
}