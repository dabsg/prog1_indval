package grafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class LäsInText extends JFrame {

	JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	JButton b1= new JButton("login");
	JLabel l1 = new JLabel("användarnamn");
	JLabel l2 = new JLabel("lösenord");
	
	public LäsInText() {
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(350,400);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		
		b1.addActionListener(e->{
			
			String user= t1.getText();
			String password= t2.getText();
			
			if(user.equals("admin") && password.equals("hej") ) {
				
				System.out.print("inloggad");
				
			}else {
				
				System.out.println("fel uppgifter");
			}
			
			
			
		});
		
		
		
		
	}
	
	

	
	public static void main(String[] args) {
	
		new LäsInText();
	}
	
}
