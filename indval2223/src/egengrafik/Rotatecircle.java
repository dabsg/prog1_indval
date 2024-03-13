package egengrafik;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Rotatecircle extends JComponent{

	double x=100;
	double y=100;
	Timer t ;

	int i = 0;

	public Rotatecircle() {
		// TODO Auto-generated constructor stub
		t=new Timer(30, e->{

			rotate();

		});

		t.start();


	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

	g.fillOval((int)Math.round(x),(int) Math.round(y), 50, 50);

	}
	public void rotate() {


		x = (Math.cos(Math.toRadians(i))*2)+x;
		y =(Math.sin(Math.toRadians(i))*2)+y;
		System.out.println(x);
		System.out.println(y);

		i++;
		if (i ==361) {

			i =0;
		}
		repaint();
	}


	public static void main(String[] args) {

		JFrame f = new JFrame();
		Rotatecircle r = new Rotatecircle();
		f.setVisible(true);
		f.setSize(new Dimension(400,400));
		f.add(r);



	}


}
