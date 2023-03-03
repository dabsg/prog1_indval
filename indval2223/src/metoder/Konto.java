package metoder;

import java.util.Scanner;

public class Konto {

	public static int ränta=5; // klassvariabel
	
	private static double saldo=0;      // instansvariabel
	
	public  Konto(int s) {
		
		saldo=s;
		
	}
	
	public Konto() {
		
		saldo=0;
	}
	
	public  double getSaldo() {
		
		
		return saldo;
		
	}
	
	public  void getRänta() {
		
		saldo = saldo * (1+ränta*0.01);
		
	}
	
	
	public static void main(String[] args) {
		
		Konto   k1=new Konto(5);
		
		
		saldo =100;
		
		k1.getRänta();
		
		k1.ränta=100;
		
		double sal=k1.getSaldo();
		
		System.out.println("konto k1: "+sal);
		
		
		Konto   k2=new Konto(1000000);
		
		k2.getRänta();
		 sal=k2.getSaldo();
		
		System.out.println("konto k2 : "+sal);
		
		
		
		
		
	}
	
	
}
