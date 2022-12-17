package Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String s = sc.next();

		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length / 2; i++) {
			if (ch[i] == ch[(ch.length - 1) - i]) {
				count++;
			}
		}
		if (count == ch.length / 2) {
			System.out.println("Enter String is Palendrome String");
		} else {
			System.out.println("Enter String is not Palendrome String");
		}

		sc.close();
	}

}
