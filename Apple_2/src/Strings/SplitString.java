package Strings;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String s = sc.nextLine();

		String[] ch = s.split(" ");
		for (int i = 0; i < ch.length ; i++) {
			for (int j = ch[i].length()-1; j >=0; j--) {
				System.out.print(ch[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println("\n");
		
		for (int i = 0; i < ch.length ; i++) {
			char s1[]=ch[i].toCharArray();
			for (int j = s1.length-1; j >=0; j--) {
				System.out.print(s1[j]);
			}
			System.out.print(" ");
		}
		
		
		sc.close();
	}

}
