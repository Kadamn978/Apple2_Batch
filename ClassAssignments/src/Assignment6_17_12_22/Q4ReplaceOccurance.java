package Assignment6_17_12_22;

import java.util.Scanner;

public class Q4ReplaceOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		String s = "Hello, World! 123";
//		String str = "I have 2 cats and 1 dog.";

//		System.out.println("Enter String");
//		String s = sc.nextLine();

		// Replace Character
//		System.out.println("Enter char to Replace");
//		char c = sc.next().charAt(0);
//		System.out.println("Enter char to Replace with");
//		char cr = sc.next().charAt(0);
//
//		char[] ch = s.toCharArray();
//
//		for (int i = 0; i < ch.length; i++) {
//			if (ch[i] == c) {
//				ch[i] = cr;
//			}
//
//		}
//		String s1 = new String(ch);
//		System.out.println(s1);

		// Replace word

		String str = "Cats are popular pets all over the world. "
				+ "Cats are known for their independence and ability to take care of themselves."
				+ " Cats are also very agile and playful, " + " Many cats form strong bonds with their owners"
				+ " Overall, cats make great companions and bring joy to the lives of their owners.";

		System.out.println("Enter char to Replace");
		String c1 = sc.next();
		System.out.println("Enter char to Replace with");
		String cr1 = sc.next();

		String ch1[] = str.split(" ");

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i].equalsIgnoreCase(c1)) {
				ch1[i] = cr1;
			}

		}
		String s2 = String.join(" ", ch1);

		System.out.println(s2);

		sc.close();
	}

}
