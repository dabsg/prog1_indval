package loops;

public class Nästladloop {
	public static void main(String[] args) {

		for (int k = 1; k < 8; k++) {

			for (int i = 1; i < k; i++) {
				System.out.print(i);

			}
			System.out.println();
		}

	}
}
