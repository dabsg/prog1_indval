package egengrafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Boll extends JComponent {

	int x=100;
	int y = 100;
	int h=100;
	int w=100;
	int xv=3;
	int yv;
	Timer t;


	public Boll() {

		this.setPreferredSize(new Dimension(500,500));
		t=new Timer(500,e->{

			System.out.println(this.y);
			update();

		}) ;

			t.start();

	}
	public void update() {

		x=x+xv;
		y++;



		this.repaint();
	}


	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.drawOval(x, y, w, h);


	}





	public static void main(String[] args) {

		JFrame f= new JFrame("boll");
		f.setLayout(new FlowLayout());
		f.setContentPane(new Boll());
		f.setVisible(true);
		f.pack();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}




}
