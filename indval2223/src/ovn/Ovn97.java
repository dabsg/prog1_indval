package ovn;

import javax.swing.JOptionPane;

public class Ovn97 {

	
	public static void main(String[] args) {
		
		String ord=JOptionPane.showInputDialog(args);
		
		String bakochfram=vändText(ord);
		
		System.out.println(bakochfram);
	}
	
	static String vändText(String text) {
		
		String s="";
		
		for(int i= text.length()-1;i>=0 ; i--) {
			
			s=s+""+text.charAt(i);
			
			
		}
		
	
		return s;
		
	}
	
	
	
}
