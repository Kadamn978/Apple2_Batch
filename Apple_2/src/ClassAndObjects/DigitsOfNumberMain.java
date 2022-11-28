package ClassAndObjects;

import java.util.Scanner;

public class DigitsOfNumberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operation you want to perform");
		System.out.println(" 1.Addition Of Digits \n 2.Product Of Digits \n 3.Frequency Of Digits");
		int ch = sc.nextInt();
		DigitsOfNumber dm = new DigitsOfNumber();

		switch (ch) {
		case 1:
			dm.addOfDigits();
			break;
		case 2:
			dm.productOfDigits();
			break;
		case 3:
			dm.frequencyOfDigits();
			break;
		default:
			System.out.println("Invalid Choice");
		}
		sc.close();
	}

}
