package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Text2 extends JFrame{

	 JLabel t=new JLabel("hej"); 
	 JButton b=new JButton("click me");
		
	public Text2() {
		
	setLayout(new FlowLayout());
	this.setVisible(true);
	this.setSize(new Dimension(400,400));
	this.add(t);
	this.add(b);
	
	b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			t.setText("du har klickat");
			
		}
	});
	
	}
	
	public static void main(String[] args) {
		
		Text2 ttt=new Text2();
	
	}
	
	
}

