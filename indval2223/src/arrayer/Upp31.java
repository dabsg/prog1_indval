package arrayer;

import java.util.Arrays;
import java.util.Scanner;

public class Upp31 {
	public static void main(String[] args) {

		double medelvärde;
		double summa;
		double tal[]=new double[3];
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange tal1");
		tal[0]=input.nextDouble();
		
		System.out.println("ange tal2");
		tal[1]=input.nextDouble();
		
		System.out.println("ange tal3");
		tal[2]=input.nextDouble();
		
		System.out.println(Arrays.toString(tal));
		
		summa=tal[0]+tal[1]+tal[2];

		medelvärde=summa/tal.length;
		
		System.out.println("summan av värdena är: "+summa+" medelvärdet är: "+medelvärde);
		
		
		
	}
}
