package PatternProgram;

public class oddAlphabetPattern {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i + i; j++) {
				if (j % 2 == 1) {
					System.out.print((char)(j-1+97) + " ");
				}
			}
			System.out.println();
		}

	}

}
