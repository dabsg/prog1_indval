package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Boll1 extends JComponent {

	// instans variabler för position på skärmen samt timer behållare
	int x = 200;
	int y = 200;
	int xv=3;
	int yv=2;
	Timer t;

	// konstruktor ,körs direkt när man skapar objekt av klassen
	public Boll1() {

		this.setPreferredSize(new Dimension(400, 400));

		//timer skapas andropar update metoden samt repaint var 50 ms
		t = new Timer(30, e -> {

			update();
			repaint();
		});

		// startar timer
		t.start();
	}

	// förändrar x och y 
	
	public void update() {

		x= x+xv;
		y=y+yv;
		
		if(x>(400-30 )) {
			
			xv= xv*-1;
			
		}
		
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		g.fillOval(x, y, 30, 30);

		super.paintComponent(g);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		Boll1 b = new Boll1();

		f.setContentPane(b);
		f.setVisible(true);
		f.pack();

	}

}
