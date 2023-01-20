package selektion_if;

public class Flera_if {

	public static void main(String[] args) {

	
		int poäng =-20;
		
		
		if (poäng>=0 && poäng <20) {
			
			System.out.println("du får betyget E");
			
		}else if(poäng >=20 && poäng<40) {
			
			System.out.println("du får betyget D");
		}else if(poäng >=40 && poäng<60) {
			
			System.out.println("du får betyget C");
		}else if(poäng >=60 && poäng<80) {
			
			System.out.println("du får betyget B");
		
		}else if(poäng >=80 && poäng<=100){
			
			System.out.println("du får betyget A");
			
		}
		
		
		
	
	}

}
