package metoder;

public class Ord {

	
	
	public static void main(String[] args) {

		String s=sättSamman("båt","motor");
		
		System.out.println("ordet blir"+s+"och är "+s.length()+"tecken långt");
	}

	public static String sättSamman(String i , String k ) {
		
		
		//System.out.println("ordet blir: "+i+k);
		
		return i+k;
		
	}

}
