package ovn;

import javax.swing.JOptionPane;

public class on27 {
	public static void main(String[] args) {

		String stringtecken=JOptionPane.showInputDialog("ange ett tecken");
		
		char chartecken=stringtecken.charAt(0);
		
		int teckenkod=(int)chartecken;
		
		System.out.println(teckenkod);
		
		
	}
}