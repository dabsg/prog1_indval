package variabler;

import javax.swing.JOptionPane;

public class OmvandlingStringToInt {

	
	
	public static void main(String[] args) {
		
		String sTal=JOptionPane.showInputDialog("ange ett tal");
		
		//int i=Integer.getInteger(sTal);
		
		
		double d = Double.parseDouble(sTal);
		
		System.out.println(d);
		
	}
}
