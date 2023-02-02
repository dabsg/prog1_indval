package metoder;

public class Matte {

	public static void plus(int e, int r) {
		r=100;
		e=100;
		int summa=e+r;
		System.out.println("summa:"+summa);
	}
	public static void plus(int e ,double r) {
		
		double summa=e+r;
		System.out.println("summa:"+summa);
	}
	public static int Minus(int a, int c) {
		
		int differens = a-c;
		return differens;
	}
	
	

	public static void main(String[] args) {
		
		int e=12;
		int r=21;
		
		
		Matte.plus(e, r);
		Matte.plus(4, 5.0);
		int di=Matte.Minus(12,7);
		System.out.println(di*1.25);
		System.out.println(e+"  "+r);
		
	}
	
}
