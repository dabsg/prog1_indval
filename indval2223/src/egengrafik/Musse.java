package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class Musse extends JComponent {

	public Musse() {
		
		this.setPreferredSize(new Dimension(400,400));
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		g.fillOval(200, 200, 30, 30);
		g.setColor(Color.green);
		g.fillOval(300, 300, 30, 30);
		g.fillRect(0, 300, 200, 200);
		
		super.paintComponent(g);
	}
	
	
	
	public static void main(String[] args) {
		
		
		JFrame f= new JFrame();
		Musse b= new Musse();
		
		f.setContentPane(b);
		f.setVisible(true);
		f.pack();
		
		
		
		
	}
	
}
