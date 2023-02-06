package upp;

import javax.swing.JOptionPane;

public class Upp85 {

	public static void main(String[] args) {

		String nString = JOptionPane.showInputDialog("ange talet n");
		int summa = 0;
		int n = Integer.parseInt(nString);

		for (int i = 1; i <= n; i = i + 1) {

			summa = summa + i;
		if(i==n) {
			System.out.print(i);
		}else {
			
			System.out.print(i + "+");
		}
		
		}

		System.out.println("=" + summa);

	}

}
