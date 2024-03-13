package egengrafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Cirkel extends JComponent {
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);

			g.fillOval(100, 100, 50, 50);

		}
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(new Dimension(400,400));
		f.setLayout(new FlowLayout());
		Cirkel c = new Cirkel();
		f.setContentPane(c);
		f.setVisible(true);

	}


}
