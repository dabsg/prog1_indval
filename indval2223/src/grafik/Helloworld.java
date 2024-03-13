package grafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Helloworld extends JFrame implements ActionListener {

	JButton b1 = new JButton("hej");


	public Helloworld() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,400));
		getContentPane().setBackground(Color.pink);
		add(b1);
		b1.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("hej");
	}


	public static void main(String[] args) {

		new Helloworld();
	}
}
