package upp;

import java.util.Scanner;

public class Upp45 {
	public static void main(String[] args) {

		Scanner  input= new Scanner(System.in);
		
		System.out.println("ange nämnare oc täljare med mellanslag");
		
		String täljareNämnare=input.nextLine(); // 5 3
		
		String nämnare = täljareNämnare.substring(0, 1);
		String täljare = täljareNämnare.substring(2, 3);
		
		int n = Integer.parseInt(nämnare);
		int t = Integer.parseInt(täljare); 
		
		int antalHela= n/t;
		
		int rest = n%t;
		
		System.out.println("talet "+n+"/"+t+"blir i blandad form "+antalHela+" "+rest+"/"+t );
		
		
		System.out.println(nämnare);
		System.out.println(täljare);
		
	}
}
