package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Text extends JFrame implements ActionListener {

	 JLabel t=new JLabel("hej"); 
	 JButton b=new JButton("click me");
		
	public Text() {
		
	setLayout(new FlowLayout());
	this.setVisible(true);
	this.setSize(new Dimension(400,400));
	this.add(t);
	this.add(b);
	b.addActionListener(this);
	
	}
	
	public static void main(String[] args) {
		
		Text ttt=new Text();
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==b) {
		t.setText("du har klickat");
		}
	}
	
}
