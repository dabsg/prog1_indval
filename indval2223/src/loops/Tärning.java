package loops;

import javax.swing.JOptionPane;

public class Tärning {
	public static void main(String[] args) {
		
		String [] s=new String[6];
		
		for (int i = 0; i < s.length; i++) {
			
			s[i]=JOptionPane.showInputDialog("ange ord");
		}
		
		String player=JOptionPane.showInputDialog("ange ett ord");
		
		String dator=  s[    (int)(Math.random() *6) ];
		
		if(dator.equals(player)) {
			
			System.out.println("du gissade rätt");
			
		}else {
			
			System.out.println("du gissade fel rätt ord var:" +dator );
		}
		
		
		
		
	}
}
