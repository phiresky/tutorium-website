public class Sinus {
	static void horizontal() {
		String[] cols = new String[30];
		for (int i = 0; i < cols.length; i++) {
			cols[i] = "";
		}
		for (double i = 0; i < 2 * Math.PI; i += 0.1) {
			int v = (int) (Math.sin(i) * 15 + 15);

			for (int j = 0; j < 30; j++) {
				if (j != v)
					cols[j] += ' ';
				else
					cols[j] += '*';
			}
		}

		for (int i = 0; i < cols.length; i++) {
			System.out.println(cols[i]);
		}

	}

	static void vertical() {
		for (double i = 0; i < 2 * Math.PI; i += 0.1) {
			int v = (int) (Math.sin(i) * 15 + 15);
			char[] output = "                              ".toCharArray();
			output[v] = '*';
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		vertical();
		horizontal();
	}
}
