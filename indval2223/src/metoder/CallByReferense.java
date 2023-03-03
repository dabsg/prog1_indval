package metoder;

import java.util.Arrays;

public class CallByReferense {

	public static void main(String[] args) {
		
		int [] i ={1,4,5,7,2};
		
		SwopFirstAndLast(i);
		System.out.println(Arrays.toString(i));
	}
	
	public static void SwopFirstAndLast(int[] k) {
		
		int temp=k[0];
		k[0]=k[4];
		k[4]=temp;
		
		
	}
	
	
	
	
}
