package Array1D;

public class InsertElementInArray {

	public static void main(String[] args) {

		String e[] = new String[10];

		for (int i = 0; i < e.length; i++) {
			if (e[i] == "0") {
				for (int j = i; j < e.length; j++) {
					if (j < e.length - 1) {
						e[i] = e[i + 1];
					}
					if (j == e.length - 1) {

					}
				}
			}
		}

	}

}
