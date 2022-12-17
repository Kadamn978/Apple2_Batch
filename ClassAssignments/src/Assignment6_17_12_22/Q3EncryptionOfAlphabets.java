package Assignment6_17_12_22;

import java.util.Scanner;

public class Q3EncryptionOfAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String TO Encrypt");
		String s = sc.next();

		char ch[] = s.toCharArray();
		int sum = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				sum = sum + (int) (ch[i] - 64);
			}
		}
		System.out.println("Potential = " + sum);
		sc.close();
	}

}
