package variabler;

import java.util.Scanner;

public class Scanner_test {

	public static void main(String[] args) {
		
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("ange ett tal");
		
		int tal =input.nextInt();
		
		System.out.println("ange ytteligare ett tal av typ dec");
		
		double tal2=input.nextDouble();
		
		
		double produkt= tal*tal2;
		
		System.out.println(produkt);
		
		
	}
	
	
}
