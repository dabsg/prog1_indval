package egengrafik;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class Boll1 extends JComponent {

	public Boll1() {
		
		this.setPreferredSize(new Dimension(400,400));
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		
		g.fillOval(100, 100, 30, 30);
		
		super.paintComponent(g);
	}
	
	
	
	public static void main(String[] args) {
		
		
		JFrame f= new JFrame();
		Boll1 b= new Boll1();
		
		f.setContentPane(b);
		f.setVisible(true);
		
		
		
		
	}
	
}
