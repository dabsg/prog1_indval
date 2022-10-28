package variabler;

import javax.swing.JOptionPane;

public class Inläsning {


	
	public static void main(String[] args) {
		
		String talText=JOptionPane.showInputDialog("ange ett tal");
		
		//int tal=Integer.parseInt(talText); 
		double tal=Double.parseDouble(talText);
		
		double summa = tal+10;
		
		System.out.println(summa);
		
	}
	
	
}
