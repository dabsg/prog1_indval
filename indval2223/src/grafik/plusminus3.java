package grafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class plusminus3 extends JFrame{

	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JLabel siffra = new JLabel("0");
	int number=0;

	public plusminus3() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,400));
		getContentPane().setBackground(Color.pink);
		add(siffra);
		add(plus);
		add(minus);
		plus.addActionListener(e->{

			number++;
			siffra.setText(""+number);
			int i = (int) (Math.random()*3+1);
			System.out.println(i);
		});
		minus.addActionListener(e->{

			number--;
			siffra.setText(""+number);

		});
	}



	public static void main(String[] args) {

		new plusminus3();
	}
}
