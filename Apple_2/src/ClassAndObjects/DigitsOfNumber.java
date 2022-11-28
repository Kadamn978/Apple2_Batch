package ClassAndObjects;

import java.util.Scanner;

public class DigitsOfNumber {

	void addOfDigits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long num = sc.nextLong();
	 	long sum = 0;
		long temp = num;
		while (temp > 0) {
			sum = sum + (temp % 10);
			temp = temp / 10;
		}
		System.out.println("Addition of Digits = " + sum);

		sc.close();
	}

	void productOfDigits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long num = sc.nextLong();
		long pro = 1;
		long temp = num;
		while (temp > 0) {
			pro = pro * (temp % 10);
			temp = temp / 10;
		}
		System.out.println("Product of Digits = " + pro);

		sc.close();
	}

	void frequencyOfDigits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter THe Number");
		long num = sc.nextLong();
		System.out.println("Digit \t Frequency");
		long digit = 0;
		for (int i = 0; i <= 9; i++) {

			long cnt = 0;
			long temp = num;
			while (temp > 0) {
				digit = temp % 10;
				if (digit == i) {
					cnt++;
				}
				temp = temp / 10;
			}
			if (cnt > 0) {
				System.out.println(i + " \t " + cnt);
			}
		}

		sc.close();
	}
}
