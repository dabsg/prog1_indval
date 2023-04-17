package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;


public class Boll1 extends JComponent {

	int x=0;
	int y=0;
	Timer t;
	
	public Boll1() {
		
		this.setPreferredSize(new Dimension(400,400));
		
		t= new Timer(50, e->{
			
			
		update();	
		repaint();	
		});
		
		t.start();
	}
	
	public void update() {
		
		x++;
		y++;
		System.out.println("hej");
	}
	
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		g.fillOval(x, y, 30, 30);
		
		
		super.paintComponent(g);
	}
	
	
	
	public static void main(String[] args) {
		
		
		JFrame f= new JFrame();
		Boll1 b= new Boll1();
		
		f.setContentPane(b);
		f.setVisible(true);
		f.pack();
		
		
		
		
	}
	
}
