package PatternProgram;

public class downwardAlphabetPattern {

	public static void main(String[] args) {
		int n = 5;

		for (int i = n; i >= 1; i--) {
	 		for (int j = 1; j <= i; j++) {
				System.out.print((char)(j-1+97) + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(i-1+97) + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print((char)(j-1+97) + " ");
			}
			System.out.println();
		}
		

	}

}
