package ovn;

import javax.swing.JOptionPane;

public class Ovn28 {
	public static void main(String[] args) {

		String stringtecken=JOptionPane.showInputDialog("ange ett tecken");
		
		char chartecken=stringtecken.charAt(0);
		
		int teckenkod=(int)chartecken;
		
		int litenbokstav=teckenkod+32;
		
		    char lowercaseletter =(char) litenbokstav; 
		
		System.out.println(lowercaseletter);
		
	}
}
