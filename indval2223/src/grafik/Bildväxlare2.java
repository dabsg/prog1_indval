package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildv�xlare2 extends JFrame {

	private JLabel l1 = new JLabel(new ImageIcon("ff.jpg"));
	private JButton b1 = new JButton("byt bild");


	public Bildv�xlare2() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(1000, 1000));
		add(l1);
		add(b1);
		b1.addActionListener(e -> {

			if (l1.getIcon().toString().equals("ff.jpg")) {

				l1.setIcon(new ImageIcon("ff1.png"));

			}else  {

				l1.setIcon(new ImageIcon("ff.jpg"));


			}

		});

	}

	public static void main(String[] args) {
		new Bildv�xlare2();
	}

}
