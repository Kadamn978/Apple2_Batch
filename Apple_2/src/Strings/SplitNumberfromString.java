package Strings;

import java.util.Scanner;

public class SplitNumberfromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String s = sc.next();

		char[] ch = s.toCharArray();
		int sum = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {// sub--> Character.isDigit(ch[i]);
				System.out.println(ch[i]);
			}
				sum=sum+(int)(ch[i]-48);
		}
		
		System.out.println("Sum = " + sum);
		
		//Using ASCII Value
		sum=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				System.out.println(ch[i]);
				sum = sum + Character.getNumericValue(ch[i]);
			}
		}
		System.out.println("Sum = " + sum);

		
		sc.close();
	}

}
