package metoder;

public class Kryptering {

	
	public static String krypt(String s) {
		
		String kryptMening="";
		
		for (int i = 0; i < s.length(); i++) {
			
			
			int k=s.charAt(i);
			
			k=k+3;
			
			kryptMening= kryptMening+"" + (char)k;
			
			
		}
		
		return kryptMening;
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		String kr=krypt("aaa bbb ccc eee ddd");
		
		System.out.println(kr);
		
		
	}
	
	
	
	
}
