package metoder;

public class CallByValue {

	
	public static void main(String[] args) {
		
		int k = 5;
		int i = 5; 
		
		printKvot(i, k);
		System.out.println(k);
	}
	
	
	public static void printKvot(int i , int k ) {
		
		System.out.println("kvoten blir "+(i/k));
		k=12;
	}
	
	
	
}
