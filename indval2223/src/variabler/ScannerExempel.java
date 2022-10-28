package variabler;

import java.util.Scanner;

public class ScannerExempel {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv namn");
		
		String namn=input.nextLine();
		
		System.out.println(namn);
		
		System.out.println("ange ålder");
		
		int ålder=input.nextInt();
		
		System.out.println("ange läng");
		
		double läng=input.nextDouble();
		
	}
	
	
	
	
}
