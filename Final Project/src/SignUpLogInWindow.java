import javax.swing.*;

public class SignUpLogInWindow {
	
	private static void displayTitles(JFrame window){
		final int TITLEHEIGHT = 60;
		final int LABELSIZE = 50;
		JLabel signUp, logIn;
		signUp = new JLabel("Sign up");
		logIn = new JLabel("Log in");
		signUp.setBounds(window.getWidth()/4, TITLEHEIGHT ,LABELSIZE, LABELSIZE);
		logIn.setBounds(window.getWidth()/3*2, TITLEHEIGHT ,LABELSIZE, LABELSIZE);
		window.add(signUp);
		window.add(logIn);
	}
	
	private static void displayLogo(JFrame window) {
		JButton logo =new JButton(new ImageIcon("C:\\Users\\moham\\eclipse-workspace\\Final Project\\LAU_logo.png"));
		logo.setBounds(0, 0, 112, 50);
		window.add(logo);
	}
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Log in / Sign up");
		window.setSize(800, 550);
		displayTitles(window);
		displayLogo(window);
		window.setLayout(null);
		window.setVisible(true);
		window.setResizable(false);
	}

}
