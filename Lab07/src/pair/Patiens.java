package pair;

public class Patiens {

	private static PairSet set;
	private static final int ITER = 1000000;
	private static int loss;

	public static void main(String[] args) {

		// set.more();
		// System.out.println(set.pick().first() + " " + set.pick().second());

		for (int i = 0; i < ITER; i++) {

			set = new PairSet(4, 13);

			// System.out.println(set.check());

			boolean lost = false;

			for (int c = 0; c <= 52; c++) {
				for (int r = 0; r <= 2; r++) {

					// System.out.println("Loop " + i);
					if (set.more())
						if (set.pick().second() == r) {
							lost = true;
							// System.out.println("Lost");
							break;
						}

				}
				if (lost) {
					loss++;
					break;
				}
			}

			if (!lost)
				;
			// System.out.println("Win");
		}

		double prob = ((double) (ITER - loss) / ITER);
		String result = String.format("%.6f", prob);

		System.out.println(result);
	}

}
