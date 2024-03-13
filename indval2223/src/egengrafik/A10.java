package egengrafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class A10 extends JComponent implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_UP) {

			System.out.print("test");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode()==KeyEvent.VK_UP) {

			System.out.print("test");
		}

	}






	private int  radie=0;
	private int xx=0;
	private int yy=0;


public A10() {
	setPreferredSize(new Dimension(400,400));

}

@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.fillOval(xx, yy, radie*2, radie*2);
	}

	public void setShape(int x , int y ,int r) {

		this.xx=x;
		this.yy=y;
		this.radie=r;
		repaint();

	}





	public static void main(String[] args) {
		A10 a=new A10();
		JFrame f=new JFrame();
		//JPanel p= new JPanel();
		JTextField x=new JTextField(20);
		JTextField y=new JTextField(20);
		JTextField r=new JTextField(20);


		f.setLayout(new FlowLayout());
		f.add(x);
		f.add(y);
		f.add(r);
		f.add(a);
		//f.add(p);
		f.pack();
		f.setVisible(true);
		f.addKeyListener(a);
		r.addActionListener(e->{



		int radie	= Integer.parseInt(r.getText());
		int xx	= Integer.parseInt(x.getText());
		int yy	= Integer.parseInt(y.getText());

		a.setShape(xx,yy,radie);



		});

	}

}
