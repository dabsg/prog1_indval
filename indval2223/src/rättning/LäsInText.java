package rättning;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JCheckBox;

public class LäsInText extends JFrame {

	JTextField t1 = new JTextField(20);
//	JTextField  = new JTextField(20);
//	JTextField  = new JTextField(20);
	JPasswordField t2 = new JPasswordField(20);
	JPasswordField t3 = new JPasswordField(20);
	JButton b1 = new JButton("skapa");
	JLabel l1 = new JLabel("användarnamn"); 
	JLabel l2 = new JLabel("lösenord");
	JLabel l3 = new JLabel("ange lösenord igen"); // visas i rutan bredid där man skriver in text
	JFrame f = new JFrame();

	JCheckBox b = new JCheckBox("godkänn");

	JLabel javascript = new JLabel("javascript");
	JLabel html = new JLabel("html / css");  
	JLabel java = new JLabel("java");

	JLabel response = new JLabel();

	JRadioButton a1 = new JRadioButton();
	JRadioButton a2 = new JRadioButton(); //klickbara rutor 
	JRadioButton a3 = new JRadioButton();

	ButtonGroup group = new ButtonGroup(); //grupp då man bara kan välja en i taget 

	public LäsInText() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(350, 400); //storlek på rutan
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(l3);
		add(t3); 

		add(b); // lägger till checkboxen

		group.add(a1);
		group.add(a2);
		group.add(a3); // knapparna för intresse 

		setVisible(true); // låter framen visas i rutan
//	setLayout(new FlowLayout());
		add(javascript);
		add(a1);
		add(html);
		add(a2);
		add(java);
		add(a3);

//		add(response);

		b1.addActionListener(e -> {

			String user = t1.getText();
			String password = t2.getText();
			String passwordigen = t3.getText();
			String intresse = "";

			// intresee

			if (a1.isSelected()) {
				intresse += "javascript";
			}
			if (a2.isSelected()) {
				intresse += "html/css";
			}
			if (a3.isSelected()) {
				intresse += "java";
			}

			// för lösenord

			String maskPassword = password.replaceAll(".", "*");

			// String felmeddelande="";

			if (!password.equals(passwordigen)) {
				System.out.println("Lösenordet matchade ej");

			}
			if (!a1.isSelected() && !a2.isSelected() && !a3.isSelected()) {
				System.out.println("Du har inte valt intresse");

			}
		
			if (user.isEmpty()) {
				System.out.println("Skriv ett användarnamn");
			}

			
			if (!b.isSelected()) {
				System.out.println("Du har inte godkänt Vilkor");
			}
			else if (a1.isSelected() || a2.isSelected() || a3.isSelected() && password.equals(passwordigen) && b.isSelected() && !user.isEmpty()) {
				JOptionPane.showMessageDialog(f,
						"Användarnamn: " + user + " \nLösenord: " + maskPassword + " \nIntresse: " + intresse);
			
		}
		}

	);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // rutan kan stängas av här 
	}

	public static void main(String[] args) {
		new LäsInText();
	}

}
