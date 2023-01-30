package loops;

public class Rik {
	public static void main(String[] args) {

		int saldo=0;
		int lön=1;
		int dagar=1;
		
		while(saldo <= 1000000) {
			
			
			saldo =saldo +lön;
			System.out.println("lön:"+lön+" saldo:"+saldo);
			lön=lön*2;
			dagar++;
			
			
		}
		
		System.out.println("antaldagar"+dagar);
		
		
		
		
	}
}
