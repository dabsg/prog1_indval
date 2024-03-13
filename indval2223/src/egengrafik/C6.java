package egengrafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class C6 extends JFrame {

	int[] tider = new int[4];
	String[] namn = new String[4];
	int antal = 0;

	JTextField f1 = new JTextField(20);// namn
	JTextField f2 = new JTextField(20);// tid
	JButton b1 = new JButton("store time");
	JLabel l1 = new JLabel("tider kommer snart");

	public C6() {

		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setSize(new Dimension(500, 500));
		this.add(f1);
		this.add(f2);
		this.add(b1);
		this.add(l1);
		b1.addActionListener(e -> {

			namn[antal] = f1.getText();
			tider[antal] = Integer.parseInt(f2.getText());

			antal++;

			if (antal == 4) {
				int summaTider = 0;
				int min =Integer.MAX_VALUE;
				String namntid="";

				for (int i = 0; i < tider.length; i++) {

					summaTider += tider[i];
					if(   tider[i]<min ) {

						min=tider[i];
						namntid=namn[i];

					}
				}

				double medel = summaTider / antal;
				l1.setText("medel är:" + medel+"\n"+"vinnare är:"+min+"namn:"+namntid);





			}







		});

	}

	public static void main(String[] args) {
		new C6();
	}

}
