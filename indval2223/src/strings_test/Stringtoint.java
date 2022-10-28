package strings_test;

import javax.swing.JOptionPane;

public class Stringtoint {
	public static void main(String[] args) {

		String stringtalint = JOptionPane.showInputDialog("ange ett tal");
		
		int inttal= Integer.parseInt(stringtalint);
		
		
		
		String stringtaldouble = JOptionPane.showInputDialog("ange ett tal");
		
		double doubletal=Double.parseDouble(stringtaldouble);
		
	}
}
