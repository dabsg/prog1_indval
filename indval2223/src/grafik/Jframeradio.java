package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Jframeradio extends JFrame{

	private JRadioButton b1=new JRadioButton("hund");
	private JRadioButton b2=new JRadioButton("katt");
	private JRadioButton b3=new JRadioButton("h�st");
	private JLabel       l1=new JLabel("text");
	private JButton		 bb=new JButton("send");

	public Jframeradio() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(400,400));
		add(b1);
		add(b2);
		add(b3);
		add(l1);
		add(bb);

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(b1);
		bgroup.add(b2);
		bgroup.add(b3);

		bb.addActionListener(e->{

			if(b1.isSelected()) {

				l1.setText("du har valt hund");
			}

		});

	}

	public static void main(String[] args) {

		new Jframeradio();
	}



}
