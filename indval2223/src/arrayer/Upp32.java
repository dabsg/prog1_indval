package arrayer;

import java.util.Arrays;
import java.util.Scanner;

public class Upp32 {
	public static void main(String[] args) {

		
		int tal[]=new int[4];
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange tal1");
		tal[0]=input.nextInt();
		
		System.out.println("ange tal2");
		tal[1]=input.nextInt();
		
		System.out.println("ange tal3");
		tal[2]=input.nextInt();
		
		System.out.println("ange tal4");
		tal[3]=input.nextInt();
	
		
		//    1234     4321
		
		int temppos3=tal[3];
		int temppos2=tal[2];
		
		tal[3]=tal[0];
		tal[2]=tal[1];
		tal[1]=temppos2;
		tal[0]=temppos3;
		
		System.out.println(Arrays.toString(tal));
		
		
		
	
	}
}
