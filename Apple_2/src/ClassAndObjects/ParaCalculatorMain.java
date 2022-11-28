package ClassAndObjects;

import java.util.Scanner;

public class ParaCalculatorMain {

	public static void main(String[] args) {
		int a, b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter what you want to Do");
		System.out.println(" 1.Addition\n 2.subtraction\n 3.Multiplication\n 4.Division\n 5.Square\n 6.Squareroot\n");
		int ch = sc.nextInt();
		if (ch>=1&&ch<=4) {
			System.out.println("Enter First No");
			a = sc.nextInt();
			System.out.println("Enter Second No");
			b = sc.nextInt();
			} 
		else {
			System.out.println("Enter First No");
			a = sc.nextInt();
			}
		ParaCalculator c1 = new ParaCalculator();
		switch (ch) {
		case 1:
			c1.add(a, b);
			break;
		case 2:
			c1.subtract(a, b);
			break;
		case 3:
			c1.multiply(a, b);
			break;
		case 4:
			c1.divide(a, b);
			break;
		case 5:
			c1.square(a);
			break;
		case 6:
			c1.squareRoot(a);
			break;
		default:
			System.out.println(" Invalid Selection");
			}
		sc.close();

	}

}
