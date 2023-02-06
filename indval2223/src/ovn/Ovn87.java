package ovn;

import javax.swing.JOptionPane;

public class Ovn87 {
	public static void main(String[] args) {

		String fortsätt="";
		
		
		
		do{
		
		
		String in = JOptionPane.showInputDialog("ange tal1");
		int tal1 = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("ange tal2");

		int tal2 = Integer.parseInt(in);

		String operator = JOptionPane.showInputDialog("ange räknesätt +,-,/,*");

		if (operator.equals("+")) {

			System.out.println("summan blir:" + (tal1 + tal2));
		}else if (operator.equals("-")) {

			System.out.println("differens blir:" + (tal1 - tal2));
		}

		
		fortsätt=JOptionPane.showInputDialog("vill du fortsätta tryck j");
		
		
		}while(fortsätt.equals("j"));
		
	}
}
