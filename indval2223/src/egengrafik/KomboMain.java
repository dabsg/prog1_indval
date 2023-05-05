package egengrafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KomboMain {

	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();   // skapar fönster
		JPanel p = new JPanel();   // skapar panel som kan hålla flera olika komponenter
		Kombo k = new Kombo();
		JButton höger = new JButton("\u21E8");  // unicode pil i knappen
		
		
		f.setVisible(true);   // gör synlig
		p.setLayout(new FlowLayout());       // sätter layout på panelen alltså hur komponenerna skall placeras i panelen
		p.add(k);   // lägger kobo i panelen
		p.add(höger);  // lägger knapp i panelen
		f.setContentPane(p); // lägger panel i jframen
		
		höger.addActionListener(e->{
			
			k.x[0]=k.x[0]+5; // flyttar det första punktens x kordinat åt höger 5 px.
			
			System.out.println(k.x[0]);
			
			k.repaint();
			
		});
		
		
		
		f.pack(); // anppassar storleken på framen utifrån komponenterna som placeras i framen 
		
		
		
		
	}
	
}
