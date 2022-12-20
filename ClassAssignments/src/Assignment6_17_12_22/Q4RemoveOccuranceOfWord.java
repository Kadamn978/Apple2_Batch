package Assignment6_17_12_22;

import java.util.Scanner;

public class Q4RemoveOccuranceOfWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = "Cats are popular pets all over the world. "
				+ "Cats are known for their independence."
				+ " Cats are also very agile and playful, "
				+ " Many cats form strong bonds with their owners";

		System.out.println("Enter char to Replace");
		String c1 = sc.next();
		String cr1 = "";

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
