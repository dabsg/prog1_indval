package ovn;

import java.util.Iterator;

public class Ovn96 {

	
	
	public static void main(String[] args) {
		
		
		double tid [] = {12.5 , 34.5 , 23.0 ,12.1};
		
		double snabbst= snabbTid(tid);
		
		System.out.println(snabbst);
	}
	
	public static double snabbTid(double [] tid) {
		
		 double min= Double.MAX_VALUE;
		
		
	for (int i = 0; i < tid.length; i++) {
		
		if(tid[i] < min) {
			
			min=tid[i];
		}
		
		
	}
		
		
		
	
		return min;
		
	}
	
	
	
	
}
