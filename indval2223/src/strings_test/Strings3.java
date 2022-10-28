package strings_test;

public class Strings3 {
 public static void main(String[] args) {
	
		char tecken;
		
		String namn="Daniel Andersson";
		
		namn=namn.toLowerCase();
		
		   
		       int antaltecken =namn.length();
		       tecken=namn.charAt(antaltecken-1);
		       
		       int pos=namn.indexOf(" ");
		       int pos1=namn.lastIndexOf("a");
		       
		System.out.println(pos1);	
			
	 
	 
	 
	 
}
}
