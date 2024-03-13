package egengrafik;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;



public class MovePoint extends JComponent {

	int [] x= {100,100,200};
	int [] y= {245,255,250};
	
	int yv=1;
	
	Timer t;
	
	public MovePoint() {
		setPreferredSize(new Dimension(500,500));
		
		t= new Timer(20, e->{
		
			
			y[2]=y[2]+yv;
			
			if(y[2]==450) {
				
				yv*=-1;
			}else if (y[2]==50) {
				
				yv*=-1;
			}
			
			
			
			
			repaint();
			
		});
		t.start();
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		
		
		
		g.fillPolygon(x, y, x.length);
		g.drawString("hej", 100, 100);
		super.paintComponent(g);
	}
	
	
	
	public static void main(String[] args) {
		
		JFrame f  = new JFrame();
		JPanel p = new JPanel();
		MovePoint mp=new MovePoint();
		
		
		p.add(mp);
		f.setContentPane(p);
		f.setVisible(true);
		f.pack();
		
		
		
	}
}
