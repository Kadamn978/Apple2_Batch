package Arrays2D;

import java.util.Scanner;

public class ArithmeticOperationsOnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter No of Columns");
		int col = sc.nextInt();

		int a[][] = new int[rows][col];
		int b[][] = new int[rows][col];
		int c[][] = new int[rows][col];

		System.out.println("Enter Array A Elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Array B Elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		// Addition OF Array A and Array B
		System.out.println("Addition of Array A & B Elements = ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println(" ");
		}

		// Subtraction OF Array A and Array B
		System.out.println("Subtraction of Array A & B Elements = ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println(" ");
		}

		// Multiplication OF Array A and Array B
		System.out.println("Multiplication of Array A & B Elements = ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println(" ");
		}

		// Division OF Array A and Array B
		System.out.println("Division of Array A & B Elements = ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] / b[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println(" ");
		}

		sc.close();
	}

}
