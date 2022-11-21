package arrayer;

import java.util.Arrays;

public class Arrsum {

	public static void main(String[] args) {
	
		int summa []= new int [6]; 
		
		int a[]= {3,4,6,7,80,7};
		
		int b[]=new int[6];
		
		b[0]=2;
		b[1]=4;
		b[2]=2;
		b[3]=9;
		b[4]=29;
		b[5]=12;
		
		
		/*
		summa[0]=a[0]+b[0];
		summa[1]=a[1]+b[1];
		summa[2]=a[2]+b[2];
		summa[3]=a[3]+b[3];
		summa[4]=a[4]+b[4];
		summa[5]=a[5]+b[5];
		*/
		
		for(int i=0;i<6;i++) {
		summa[i]=a[i]+b[i];
		}
		
		String arrsomstring=Arrays.toString(summa);
		
		System.out.println(arrsomstring);
		
		
		
		
	}
	
}
