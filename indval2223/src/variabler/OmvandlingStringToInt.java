package variabler;

import java.util.Arrays;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class OmvandlingStringToInt {

	
	
	public static void main(String[] args) {
		
		String sTal=JOptionPane.showInputDialog("ange ett tal");
		
		//int i=Integer.getInteger(sTal);
		
		
		double d = Double.parseDouble(sTal);
		
		System.out.println(d);
		String s=Calendar.getInstance().getTime().toString();
		System.out.println(s);
		
		String [] arr= {"1","x","2"};
		String rad []= new String [13];
		
		int slump =(int) (Math.random()*3);
		
		rad[1]= arr[slump];
		
		System.out.println(Arrays.toString(rad));
		
	}
}
