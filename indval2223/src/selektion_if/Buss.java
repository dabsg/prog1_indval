package selektion_if;

import javax.swing.JOptionPane;

public class Buss {

	public static void main(String[] args) {
		
		String sålder=JOptionPane.showInputDialog("ange ålder");
		
		int ålder=Integer.parseInt(sålder);
		
		if(ålder <18 || ålder>=65 ) {
			System.out.println("du skall betala 5kr");
		}else {
			System.out.println("du skall betala 10kr");
		}
		
		
		
		
	}
}
