package arrayer;

public class Arr1 {

	public static void main(String[] args) {
		
		int b [] = new int[3];
		
		b[0]=1;
		b[2]=5;
		b[1]=10;
		//b[3]=30; index out of bounds
		
		String s[] = new String[5];
		
		s[0]="hej";
		s[1]="då";
		
		
		String mening= s[0] +" "+ s[1];
		
		System.out.println(mening);
		
		
	}
	
}
