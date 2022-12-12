package objektorientering;

public class Bil {

	private int växel;
	private boolean motorPå;
	
	public Bil(boolean onOff) {
		
		växel=0;
		motorPå=onOff;
		System.out.println(växel);
		
	}
	
	public int växla(int v) {
		
		växel=v;
		System.out.println(växel);
		return växel;
	}
	
	
	
	
	public static void main(String[] args) {
	
		int [] a= new int [12];
		 
		
		Bil b1 =new Bil(true);
		Bil b2 = new Bil(false);
		
		int vvv =b1.växla(5);
		System.out.println(vvv);
		
	}
	
}
