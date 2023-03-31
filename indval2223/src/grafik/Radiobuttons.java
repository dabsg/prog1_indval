package grafik;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class Radiobuttons {

	JFrame f = new JFrame();

	JLabel javascript = new JLabel("javascript");
	JLabel html = new JLabel("html / css");
	JLabel java = new JLabel("java");

	JLabel response = new JLabel();

	JRadioButton b1 = new JRadioButton();
	JRadioButton b2 = new JRadioButton();
	JRadioButton b3 = new JRadioButton();

	JButton skapaKonto = new JButton("skap konto");

	ButtonGroup group = new ButtonGroup();

	public Radiobuttons() { // skapar konstruktor

		group.add(b1);
		group.add(b2);
		group.add(b3);

		f.setVisible(true);
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		f.add(javascript);
		f.add(b1);
		f.add(html);
		f.add(b2);
		f.add(java);
		f.add(b3);
		f.add(skapaKonto);

		f.add(response);

		skapaKonto.addActionListener(e -> {

			if (b1.isSelected()) {

				response.setText("du valde javascript");
			} else {
				if (b2.isSelected()) {

					response.setText("du valde html/ css");
				} else {

					response.setText("du valde java");
				}
			}
		});

		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Radiobuttons(); // skapar objekt av klassen

	}

}
