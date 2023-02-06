package loops;

public class Arrfind {
	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int i[] = { 12, 34, 45, 23, 12, 567, 87, 34 };

		for (int j = 0; j < i.length; j++) {

			if (i[j] > max) {

				max = i[j];
			}
			if (i[j] < min) {

				min= i[j];
			}

		}
		System.out.println(max);
		System.out.println(min);

	}
}
