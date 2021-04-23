
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Exceptions.*;
import UsersTextFile.UsersTextFile;
import Users.*;

@SuppressWarnings("serial")
public class SignupPage extends JFrame implements ActionListener{
	private JButton signupButton;
	private JLabel firstName, lastName, userType, email, password;
	private JLabel invalidEmail, invalidPassword, alreadySignedUp1, alreadySignedUp2;
	private JRadioButton student, instructor;
	private ButtonGroup bg;
	private JTextField firstNameInput, lastNameInput, emailInput, passwordInput;
	
	public SignupPage() {
		this.setTitle("Sign up page");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(360, 350);
		this.setLayout(null);
		ImageIcon image = new ImageIcon("lau-logo.jpg");
		this.setIconImage(image.getImage());
		
		firstName = new JLabel("First Name:");
		firstName.setBounds(70 ,10, 80, 25);
		firstNameInput = new JTextField();
		firstNameInput.setBounds(140, 10, 100, 25);
		this.add(firstName);
		this.add(firstNameInput);
		
		lastName = new JLabel("Last Name: ");
		lastName.setBounds(70, 45, 80, 25);
		lastNameInput = new JTextField();
		lastNameInput.setBounds(140, 45, 100, 25);
		this.add(lastName);
		this.add(lastNameInput);
		
		userType = new JLabel("User type:");
		student = new JRadioButton("Student");    
		instructor = new JRadioButton("Instructor");  
		userType.setBounds(35, 80, 60, 25);
		student.setBounds(105, 80, 70, 25);   
		instructor.setBounds(195, 80, 80, 25);
		bg = new ButtonGroup();
		bg.add(student);
		bg.add(instructor);
		student.setSelected(true);
		this.add(userType);
		this.add(student);
		this.add(instructor);
		
		email = new JLabel("LAU Email:");
		email.setBounds(36 ,115, 80, 25);
		emailInput = new JTextField();
		emailInput.setBounds(100, 115, 180, 25);
		this.add(email);
		this.add(emailInput);
		invalidEmail = new JLabel();
		invalidEmail.setBounds(65, 135, 200, 20);
		invalidEmail.setForeground(Color.red);
		this.add(invalidEmail);
		
		password = new JLabel("Password:");
		password.setBounds(70, 160, 80, 25);
		passwordInput = new JTextField();
		passwordInput.setBounds(140, 160, 100, 25);
		this.add(password);
		this.add(passwordInput);
		invalidPassword = new JLabel();
		invalidPassword.setBounds(40, 180, 255, 20);
		invalidPassword.setForeground(Color.red);
		this.add(invalidPassword);
		
		alreadySignedUp1 = new JLabel();
		alreadySignedUp2 = new JLabel();
		alreadySignedUp1.setBounds(35, 210, 255, 20);
		alreadySignedUp2.setBounds(48, 225, 255, 20);
		alreadySignedUp1.setForeground(Color.red);
		alreadySignedUp2.setForeground(Color.red);
		this.add(alreadySignedUp1);
		this.add(alreadySignedUp2);
		
		signupButton = new JButton("Sign up");
		signupButton.setBounds(125, 250, 100, 35);
		signupButton.addActionListener(this);
		this.add(signupButton);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent click) {
		if (click.getSource() == signupButton)
			try {
				String firstName = firstNameInput.getText();
				String lastName = lastNameInput.getText();
				String userType = student.isSelected() ? "Student" : "Instructor";
				LauUser user;
				if(userType.equals("Student"))
					user  = new Student(firstName, lastName);
				else 
					user = new Instructor(firstName, lastName);
				firstNameInput.setEditable(false);
				lastNameInput.setEditable(false);
				student.setEnabled(false);
				instructor.setEnabled(false);
				String email = emailInput.getText();
				String password =  passwordInput.getText();
				boolean validEmail = false;
				boolean validPassword = false;
				try {
					user.setEmail(email);
					invalidEmail.setText("");
					emailInput.setEditable(false);
					validEmail = true;
				}
				catch(InvalidEmailException e) {
					invalidEmail.setText(e.getMessage());
				}
				try {
					user.setPassword(password);
					invalidPassword.setText("");
					passwordInput.setEditable(false);
					validPassword = true;
				}
				catch (InvalidPasswordException e){
					invalidPassword.setText(e.getMessage());
				}
				if (validEmail && validPassword)
					try {
						UsersTextFile.addUser(user);
						alreadySignedUp1.setText("");
						alreadySignedUp2.setText("");
						new LoginPage(true); 
						this.dispose();
					}
					catch (UserAlreadySignedUpException e){
						emailInput.setEditable(true);
						alreadySignedUp1.setText(e.getMessage());
						alreadySignedUp2.setText("either log in with it or use another email");
					}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
