package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Text3 extends JFrame {    // ärver klassen jfram och blir själv ett fönster

	 JLabel t=new JLabel("hej");         // skapar ett label objekt och lagrar de i t
	 JButton b=new JButton("click me");   // sjapar ett kanpp objekt och lagrar de i b
		
	public Text3() {
		
	setLayout(new FlowLayout()); // sätter layout 
	setVisible(true);      // gör fönster synligt
	setSize(new Dimension(400,400));  // sätter storlek på fönster
	add(t);  // lägger till label text ruta
	add(b);  // lägger till knapp
	
	
	b.addActionListener(e->{   // lyssnar efter händelser
		
		t.setText("hej då");  // byter texten
		
	});
	
	
	}
	
	public static void main(String[] args) {
		
		Text3 ttt=new Text3();
	
	}

	
}
