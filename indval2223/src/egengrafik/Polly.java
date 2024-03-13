package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Polly extends JComponent {

	public Polly() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.PINK);

		int xPoints[]= {100,200,300};
		int yPoints[]= {200,400,500};

		g.fillPolygon(xPoints, yPoints, 3);
	}
	public static void main(String[] args) {


	JFrame f = new JFrame();
	f.setVisible(true);
	f.setSize(new Dimension(400,400));
	f.setContentPane(new Polly());


	}

}
