package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jframeinput extends JFrame {

	//private JButton b1=new JButton();
	private JTextField field1=new JTextField("mata in ett tal",30);
	private JTextField field2=new JTextField("mata in ett tal",30);
	private JLabel lab= new JLabel("denna text kan du �ndra");
	private JButton b1 = new JButton("summera");

	public Jframeinput() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,400));
		lab.setFont(new Font("arial",20,30));
		add(field1);
		add(field2);
		add(lab);
		add(b1);
		b1.addActionListener(e->{


			lab.setText(""+(Integer.parseInt(field1.getText())+Integer.parseInt(field2.getText())));

		});


	}

	public static void main(String[] args) {

		Jframeinput i =new Jframeinput();
	}



}
