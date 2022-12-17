package Strings;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		String str[] = { "Raj", "Aadya", "Veer", "Rahul", "Anjali", "Ajay", "Leena", "Reena", "Meena" };

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " = " + str[i].length());
		}
		System.out.println("\n");

		// Using Function
		System.out.println("Names Starting with R(withFunction)");
		for (int i = 0; i < str.length; i++) {
			if (str[i].startsWith("R")) {
				System.out.println(str[i]);
			}
		}
		System.out.println("\n");

		// Without Using Function
		System.out.println("Names Starting with R");
		for (int i = 0; i < str.length; i++) {
			char ch[] = str[i].toCharArray();
			if (ch[0] == 'R') {
				String s = new String(ch);
				System.out.println(s);
			}
		}
		System.out.println("\n");

		// Using Function
		System.out.println("Names Ending with a(withFunction)");
		for (int i = 0; i < str.length; i++) {
			if (str[i].endsWith("a")) {
				System.out.println(str[i]);
			}
		}
		System.out.println("\n");

		// Without Using Function
		System.out.println("Names Ending with a");
		for (int i = 0; i < str.length; i++) {
			char ch[] = str[i].toCharArray();
			if (ch[ch.length - 1] == 'a') {
				String s = new String(ch);
				System.out.println(s);
			}
		}
		System.out.println("\n");

		System.out.println("Names Contains with ee");
		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("ee")) {
				System.out.println(str[i]);
			}
		}
		System.out.println("\n");

		System.out.println("Names Contains with j");
		for (int i = 0; i < str.length; i++) {
			char ch[] = str[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == 'j') {
					String s = new String(ch);
					System.out.println(s);
					break;
				}
			}
		}
		System.out.println("\n");

		// Array Sorting Ascending Order
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
					String t = str[j];
					str[j] = str[j + 1];
					str[j + 1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(str));
		System.out.println("\n");

		// Array Sorting Descending Order
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1; j++) {
				if (str[j].compareTo(str[j + 1]) < 0) {
					String t = str[j];
					str[j] = str[j + 1];
					str[j + 1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(str));
		System.out.println("\n");

	}

}
