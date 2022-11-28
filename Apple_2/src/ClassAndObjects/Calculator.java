package ClassAndObjects;

import java.util.Scanner;

public class Calculator { 

	void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No");
		int a= sc.nextInt();
		System.out.println("Enter Second No");
		int b= sc.nextInt();
		System.out.println("Addition = " + (a+b));
		sc.close();
	}

	void subtract() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No");
		int a= sc.nextInt();
		System.out.println("Enter Second No");
		int b= sc.nextInt();
		System.out.println("Subtraction = " + (a-b));
		sc.close();


	}

	void multiply() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No");
		int a= sc.nextInt();
		System.out.println("Enter Second No");
		int b= sc.nextInt();
		System.out.println("Multiplication = " + (a*b));
		sc.close();

	}

	void divide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No");
		int a= sc.nextInt();
		System.out.println("Enter Second No");
		int b= sc.nextInt();
		System.out.println("Division = " + (a/b));
		sc.close();

	}

	void square() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No for Square");
		int a= sc.nextInt();
		System.out.println("Square = " + (a*a));
		sc.close();

	}

	void squareRoot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No to find SquareRoot");
		float a= sc.nextInt();
		System.out.println("SquareRoot = " + (a/a));
		sc.close();

	}

}
