package ovn;

public class Ovn99 {

	public static void main(String[] args) {

		int antalsexor = slåTärning(6000000);
		System.out.println(antalsexor);
	}

	public static int slåTärning(int i) {

		int antalSexor = 0;
		int tärning = 0;
		for (int j = 0; j < i; j++) {

			tärning = (int) ((Math.random() * 6) + 1);
			if (tärning == 6) {
				antalSexor++;
			}
		}

		// System.out.println(tärning);

		return antalSexor;
	}
}
