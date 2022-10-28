package ovn;

import java.util.Scanner;

public class Ovn23 {
public static void main(String[] args) {
	
Scanner input = new Scanner(System.in);

System.out.println("ange din ålder");
int ålder = input.nextInt(); // 17

int svar= (int)  (17/10.0);  //   1

int svar2= svar*10;     //  10

int svar3= svar2+10;   // 20
System.out.println(svar3);
int årKvar= svar3-ålder;

System.out.println("du har"+årKvar+"år kvar till du fyller"+svar3);




	
	
}
}
