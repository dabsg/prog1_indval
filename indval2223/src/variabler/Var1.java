package variabler;

import java.util.Calendar;

public class Var1 {

	public static void main(String[] args) {
		
		int tal = 5;  // deklaration + tilldelning = initsiering
		
		double tal2= 2.1;
		
		String text= "hej";
		
		double  produkt=(tal*tal2);
		
		System.out.println("svaret blir" +produkt+" kr");
		
		String datornsTid=Calendar.getInstance().getTime().toString();
		System.out.print(datornsTid);
		
	}
	
}
