package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Kombo extends JComponent{

	public int x []= { 200, 220,240 };
	public int y []= { 200, 220,200 };
	
	
	
	public Kombo() {     // konstruktor
	
		setPreferredSize(new Dimension(400,400));// sätter storlek på jcomponenten
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	
		g.setColor(new Color(245, 12, 48));    // red green and blue
		g.fillPolygon(x, y, x.length);
		
		super.paintComponent(g);
	}
	
	
	
	
}
