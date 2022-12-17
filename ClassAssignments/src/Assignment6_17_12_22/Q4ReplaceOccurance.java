package Assignment6_17_12_22;

import java.util.Scanner;

public class Q4ReplaceOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		String str = "I have 2 cats and 1 dog.";
//		String s="Hello, World! 123";

		System.out.println("Enter String");
		String s = sc.nextLine();
		System.out.println("Enter char to Replace");
		char c = sc.next().charAt(0);
		System.out.println("Enter char to Replace with");
		char cr = sc.next().charAt(0);

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c) {
				ch[i] = cr;
			}

		}
		String s1 = new String(ch);
		System.out.println(s1);

		sc.close();
	}

}
