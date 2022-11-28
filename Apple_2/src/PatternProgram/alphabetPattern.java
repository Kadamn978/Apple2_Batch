package PatternProgram;

public class alphabetPattern {

	public static void main(String[] args) {

		// Serial Alphabet
		int n1 = 5;
		for (int i = 1; i <= n1; i++) {

			char ch1 = 'a';

			for (int j = 1; j <= i; j++) {
				System.out.print(ch1 + " ");
				ch1++;
			}
			System.out.println();
		}

		System.out.println();

		// Same Alphabet

		char ch1 = 'a';
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch1 + " ");
			}
			System.out.println();
			ch1++;
		}

		System.out.println();

		// Serial Alphabet with Direct character i\p
		for (char ch = 'a'; ch <= 'e'; ch++) {
			for (char cha = 'a'; cha <= ch; cha++) {
				System.out.print(cha + " ");
			}
			System.out.println();
		}

		System.out.println();

		// Same Alphabet with Direct character i\p

		for (char ch = 'a'; ch <= 'e'; ch++) {
			for (char cha = 'a'; cha <= ch; cha++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}

		System.out.println();

		// Serial Alphabet with typecasting
		int i, j;
		int n = 5;

		for (i = 1; i <= n; i++) {
			int ch = 97;
			for (j = 1; j <= i; j++) {
				System.out.print((char) (ch - 1 + j) + " ");
			}
			System.out.println("");
		}
		System.out.println();

		// Same Alphabet with typecasting
		for (i = 1; i <= n; i++) {
			int ch = 97;
			for (j = 1; j <= i; j++) {
				System.out.print((char) (ch - 1 + i) + " ");
			}
			System.out.println("");
		}
		System.out.println();

	}

}
