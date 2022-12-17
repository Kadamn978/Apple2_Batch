package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramUsingMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String 1");
		String s1 = sc.next();

		System.out.println("Enter String 2");
		String s2 = sc.next();

		if (s1.length() == s2.length()) {

			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

//			if (Arrays.equals(ch1, ch2)) {
//				System.out.println("Enter String is Anagram String");
//			} 
//			else {
//				System.out.println("Enter String is not Anagram String");
//			}

//			int count = 0;
//			for (int i = 0; i < ch2.length; i++) {
//				if (ch1[i] == ch2[i]) {
//					count++;
//				}
//				if (count == ch1.length) {
//					System.out.println("Enter String is Anagram String");
//				} else {
//					System.out.println("Enter String is not Anagram String");
//				}
//
//			}
			int flag = 1;

			for (int i = 0; i < ch2.length; i++) {
				if (ch1[i] != ch2[i]) {
					flag = 0;
					break;
				}
			}

			if (flag == 1) {
				System.out.println("Enter String is Anagram String");
			} else {
				System.out.println("Enter String is not Anagram String");
			}

		}
		sc.close();
	}

}
