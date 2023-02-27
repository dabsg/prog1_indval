package metoder;

public class Matte {

	
	public static void printNumbers(int i) {
		
		for(int j=0; j<i ;j++) {
			
			System.out.println(j);
		}
		
	}
	public static void printSumma(int i , int j ) {
		
		int summa = i+j;
		
		System.out.println("summa:"+summa);
		
	}
	
	
	public static void printSumma(int i,int j,int k) {
		
		System.out.println("summa"+(i+j+k));
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		printNumbers(12);
		
		printSumma(5,5);

		printSumma(5,5,5);
	}
	
	
}
