
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Users.LauUser;

public class BlackBoardWindow {
	private JFrame frame;
	private JPanel pannel;
	private JLabel text;
	
	public BlackBoardWindow(LauUser user){
		frame=new JFrame("BlackBoard");
		frame.setSize(384, 216);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pannel=new JPanel();
		pannel.setLayout(null);
		frame.add(pannel);
		text = new JLabel(String.format("Welcome %s %s", user.getFirstName(), user.getLastName()));
		text.setBounds(10, 20, 800, 25);
		pannel.add(text);
		frame.setVisible(true);
	 }

}
