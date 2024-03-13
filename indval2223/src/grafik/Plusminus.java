package grafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Plusminus extends JFrame implements ActionListener {

	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JLabel siffra = new JLabel("0");
	int number=0;

	public Plusminus() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,400));
		getContentPane().setBackground(Color.pink);
		add(siffra);
		add(plus);
		add(minus);
		plus.addActionListener(this);
		minus.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==minus) {

			number--;
			siffra.setText(""+number);

		}else {

			number++;
			siffra.setText(""+number);
		}
			}


	public static void main(String[] args) {

		new Plusminus();
	}
}
