package operatorer;

public class Modulus1 {

	public static void main(String[] args) {
		
		
		
		/*
		 * omvandlar sekunder till timmar , minuter och sekunder
		 * 
		 * 
		 */
	
		int sekunder = 5999090;
		int timmar = sekunder/3600;
		int resttimmar1=sekunder%3600; 
		//int resttimmar= sekunder-(timmar*3600);   rest beräkning manuellt
		int minuter = resttimmar1/60;
		
		int sekunderkvar=resttimmar1%60;
		
		
		System.out.println(timmar+"h "+minuter+ " m "+sekunderkvar+" s" );
		
		
		
		
	}
}
