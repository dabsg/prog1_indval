package ovn;

import java.util.Scanner;

public class Ovn23version2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("ange din ålder");
		int ålder = input.nextInt(); // 17

		int nollar=((int) ((ålder/10.0)+0.5))*10;

		int årKvar= nollar-ålder;
		
		System.out.println("du har"+årKvar+"år kvar till du fyller"+nollar);

			
		}
}
