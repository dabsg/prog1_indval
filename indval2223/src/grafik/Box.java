package grafik;


import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Box {

	JFrame f = new JFrame();
	JCheckBox b = new JCheckBox();
	JButton knapp = new JButton("skapa");
	
	
	
	public Box() {
		
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setSize(500,500);
		f.add(b);
		f.add(knapp);
		
		knapp.addActionListener(e->{
			
			if(b.isSelected()) {
				
				System.out.println("i bockad");
				f.getContentPane().setBackground(Color.pink);
				
			}else {
				
				System.out.println("inte i bockad");
			}
			
		});
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new Box();
		
	}
	
	
}
