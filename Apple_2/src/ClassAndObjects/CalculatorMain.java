package ClassAndObjects;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter what you want to Do");
		System.out.println(" 1.Addition\n 2.subtraction\n 3.Multiplication\n 4.Division\n 5.Square\n 6.Squareroot\n");
		int ch = sc.nextInt();
		Calculator c1 = new Calculator();
		switch (ch) {
		case 1:
			c1.add();
			break;
		case 2:
			c1.subtract();
			break;
		case 3:
			c1.multiply();
			break;
		case 4:
			c1.divide();
			break;
		case 5:
			c1.square();
			break;
		case 6:
			c1.squareRoot();
			break;
		default:
			System.out.println(" Invalid Selection");
		}
		sc.close();
	}

}
