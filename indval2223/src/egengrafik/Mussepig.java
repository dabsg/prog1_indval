package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Mussepig extends JComponent {

	public Mussepig() {

		setPreferredSize( new Dimension(400,400));
	}


	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.setColor(Color.CYAN);
	    g.fillRect(0, 0, 400, 400);
	    g.setColor(Color.black);
	    g.fillOval(100, 100, 100, 100);

	}




	public static void main(String[] args) {


		JFrame f = new JFrame("mussepig");
		f.setLayout(new FlowLayout() );
		f.setContentPane(new Mussepig());
		f.setVisible(true);
		f.pack();




	}

}
