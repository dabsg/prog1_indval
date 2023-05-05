package egengrafik.bollar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Game extends JComponent {

	Boll[] b = new Boll[10000];
	Timer t;

	public Game() {

		for (int i = 0; i < b.length; i++) {

			b[i] = new Boll((int) (Math.random() * 700), 
					(int) (Math.random() *700), 
					(int) (Math.random()*6)-3, 
					(int) (Math.random()*6)-3, 
					new Color((int) (Math.random()*255),
							(int) (Math.random()*255), 
							(int) (Math.random()*255)));

		}

		this.setPreferredSize(new Dimension(700, 700));
	
		t=new Timer(50, e->{
			System.out.println("hej");
		
			for (Boll boll : b) {
				
				boll.move();
					
			}
			
			
			this.repaint();
		});
	
		t.start();
	
	
	}

	@Override
	protected void paintComponent(Graphics g) {

		for (Boll boll : b) {
			g.setColor(boll.c);
			g.fillOval(boll.x, boll.y, 20, 20);
		}

		super.paintComponent(g);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame("bollspel");
		Game g = new Game();

		f.setVisible(true);
		f.setContentPane(g);
		f.pack();

	}

}
