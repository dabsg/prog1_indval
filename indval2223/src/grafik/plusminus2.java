package grafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class plusminus2 extends JFrame{

	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JLabel siffra = new JLabel("0");
	int number=0;

	public plusminus2() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,400));
		getContentPane().setBackground(Color.pink);
		add(siffra);
		add(plus);
		add(minus);
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				number++;
				siffra.setText(""+number);

			}
		});
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				number--;
				siffra.setText(""+number);

			}
		});
	}



	public static void main(String[] args) {

		new plusminus2();
	}
}
