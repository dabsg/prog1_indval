package garafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class Helloworld extends JWindow implements ActionListener {

	JButton b1 = new JButton("hej");
	
	JLabel l1= new JLabel("Daniel test");


	public Helloworld() throws FontFormatException, IOException {

		Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("FuzzyBubbles-Regular.ttf").openStream());   

		GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
		genv.registerFont(font);
		// makesure to derive the size
		font = font.deriveFont(12f);
		
		l1.setFont(font);
		add(l1);
		
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,400));
		getContentPane().setBackground(Color.pink);
		add(b1);
		b1.addActionListener(e-> {});

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("hej");
	}


	public static void main(String[] args) throws FontFormatException, IOException {

		new Helloworld();
	}
}
