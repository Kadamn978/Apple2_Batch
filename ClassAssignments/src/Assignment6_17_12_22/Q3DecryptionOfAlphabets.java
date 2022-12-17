package Assignment6_17_12_22;

import java.util.Arrays;
import java.util.Scanner;

public class Q3DecryptionOfAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String TO Encrypt");
		String s = sc.nextLine();

		String[] s1 = s.split(" ");
		System.out.println(Arrays.toString(s1));


		for (int i = 0; i < s1.length; i++) {
			char ch[] = s1[i].toCharArray();
			int sum = 0;
			for (int j = 0; j < ch.length; j++) {

				if (ch[j] >= 'A' && ch[j] <= 'Z') {
					sum = sum + (int) (ch[j] - 64);
				}
			}
			System.out.print(s1[i] + " = " + sum+", ");
		}
		sc.close();
	}

}
