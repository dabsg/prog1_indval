package ovn;

import java.util.Scanner;

public class Ovn91 {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ange radie");
		double r=sc.nextDouble();
		
		calcBasArea(r);
	}

	private static void calcBasArea(double r) {
		
		double area= Math.PI*r*r;
		
		System.out.println("svar:"+ area);
	}
}
