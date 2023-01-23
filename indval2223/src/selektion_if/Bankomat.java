package selektion_if;

import java.util.Scanner;

public class Bankomat {
	public static void main(String[] args) {

		int saldo = 10000;

		Scanner input = new Scanner(System.in);

		int val = 1;

		while (val != 4) {

			System.out.println("1:saldo \n2:uttag \n3:insättning \n4:avsluta");

			val = input.nextInt();

			switch (val) {

			case 1:
				System.out.println("saldo =" + saldo);
				break;
			case 2:

				System.out.println("hur mycket vill du ta ut");
				int uttag = input.nextInt();

				if (uttag > saldo) {
					System.out.println("uttag för stort");
				} else {

					if ((uttag % 100) == 0) {

						saldo -= uttag;
						// saldo= saldo-uttag;
						System.out.println("du får " + (uttag / 100) + "st hundralappar");

					} else {

						int hundralappar = ((int) (uttag / 100)) + 1;// 7,53

						saldo = saldo - (hundralappar * 100);

						System.out.println("du får " + hundralappar + "st hundralappar");
					}
				}

				break;
			case 3:

				System.out.println("hur mycket pengar vill du sätta in");
				int insättning = input.nextInt();
				saldo += insättning;
				System.out.println("saldo =" + saldo);

				break;

			case 4:

				System.exit(0);
				break;
			default:

				System.out.println("felaktig inmatning");

			}

		}
	}
}