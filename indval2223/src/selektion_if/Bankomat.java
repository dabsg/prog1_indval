package selektion_if;

import java.util.Scanner;

public class Bankomat {
	public static void main(String[] args) {

		int saldo = 10000;
		
		Scanner input = new Scanner(System.in);
		System.out.println("1:saldo \n2:uttag \n3:insättning");
		
		int val = input.nextInt();
		
		switch(val) {
		
		case 1:
			System.out.println("saldo ="+saldo);
			break;	
		case 2:
			break;
		case 3:
			break;
		default:

		}
		
		
	}
}
