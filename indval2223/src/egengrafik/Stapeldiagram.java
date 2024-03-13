package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Stapeldiagram extends JComponent {

	int [] i = {40,60,80,10};
	Color [] c= {Color.black,Color.BLUE,Color.green,Color.pink};


	public Stapeldiagram() {

		setPreferredSize( new Dimension(400,400));
	}


	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.setColor(Color.CYAN);
	    g.fillRect(0, 0, 400, 400);


	}




	public static void main(String[] args) {


		JFrame f = new JFrame("Stapeldiagram");
		f.setLayout(new FlowLayout() );
		f.setContentPane(new Stapeldiagram());
		f.setVisible(true);
		f.pack();




	}

}
