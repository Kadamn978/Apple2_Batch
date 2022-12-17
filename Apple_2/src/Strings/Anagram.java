package Strings;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {

		System.out.println("Enter String 1");
		String s1 = sc.next();

		System.out.println("Enter String 2");
		String s2 = sc.next();
		
		if(s1.length()==s2.length()) {

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		int count = 0;
		
		for (int i = 0; i < ch1.length / 2; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if (ch2[j] == ch1[i]) {
					count++;
					ch2[j] = 0;
					ch1[i] = 1;
				}
			}
		}
		if (count == ch1.length / 2) {
			System.out.println("Enter String is Anagram String");
		} else {
			System.out.println("Enter String is not Anagram String");
		}
		System.out.println("Do You Want To Continue : ");
		System.out.println("1.Continue   2.Exit");
		}
		else {
			System.out.println("Enter String is not Anagram String As their length are Not Equal");
		}
		ch=sc.nextInt();
		}
		while(ch==1);
		sc.close();
	}

}
