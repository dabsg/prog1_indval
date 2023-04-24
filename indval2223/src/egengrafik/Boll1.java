package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Boll1 extends JComponent implements KeyListener {

	// instans variabler för position på skärmen samt timer behållare
	double x = 200;
	double y = 200;
	double xv = 3;
	double yv = 2;

	double g = 1.7;

	Timer t;

	// konstruktor ,körs direkt när man skapar objekt av klassen

	public int ytoInt() {

		return (int) Math.round(y);
	}

	public int xtoInt() {

		return (int) Math.round(x);
	}

	public Boll1() {

		this.setPreferredSize(new Dimension(400, 400));

		// timer skapas andropar update metoden samt repaint var 50 ms
		t = new Timer(30, e -> {

			update();
			repaint();
		});

		// startar timer
		t.start();
	}

	// förändrar x och y

	public void update() {

		x = x + xv;
		y = y + yv;

		yv = yv + g;
		System.out.println(yv);

		if (x > (400 - 30)) {

			xv = xv * -1;

		}

		if (y >= (400 - 30)) {

			y = 369;
			System.out.println(yv);
			if (yv < 2) {

				yv = 0;

			}

			yv = yv - 4;
			yv = yv * -1;

		}
		if (y < 0) {

			yv = yv * -1;

		}
		if (x <= 0) {

			xv = xv * -1;

		}

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		g.fillOval(xtoInt(), ytoInt(), 30, 30);

		super.paintComponent(g);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		Boll1 b = new Boll1();
		f.addKeyListener(b);
		f.setContentPane(b);
		f.setVisible(true);
		f.pack();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println("du har tryckt på en tangent");

		if (e.getKeyCode() == KeyEvent.VK_UP) {

			y-=20;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
