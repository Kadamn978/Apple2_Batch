package Arrays2D;

import java.util.Scanner;

public class SumOfDiagonalMinorAndMajor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter No of Columns");
		int col = sc.nextInt();

		int a[][] = new int[rows][col];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int sum = 0, prod = 1;

		// Addition of all ELements
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				sum = sum + a[i][j];
			}
		}
		System.out.println("Sum Of All Elements = " + sum);
		// Multiplication of all Elements
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				prod = prod * a[i][j];
			}
		}
		System.out.println("Product Of All Elements = " + prod);

		// Addition of Diagonal ELements
		sum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j) {
					sum = sum + a[i][j];
				}
			}
		}
		System.out.println("Sum Of Diagonal Elements = " + sum);

		// Multiplication of Diagonal Elements
		prod = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j) {
					prod = prod * a[i][j];
				}
			}
		}
		System.out.println("Product Of Diagonal Elements = " + prod);

		// Addition of Lower ELements
		sum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				if (i > j) {
					sum = sum + a[i][j];
				}
			}
		}
		System.out.println("Sum Of Diagonal Elements = " + sum);

		// Multiplication of Lower Triangle Elements
		prod = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				if (i > j) {
					prod = prod * a[i][j];
				}
			}
		}
		System.out.println("Product Of Diagonal Elements = " + prod);

		// Addition of Upper Triangle ELements
		sum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				if (i < j) {
					sum = sum + a[i][j];
				}
			}
		}
		System.out.println("Sum Of Diagonal Elements = " + sum);

		// Multiplication of Upper Triangle Elements
		prod = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				if (i < j) {
					prod = prod * a[i][j];
				}
			}
		}
		System.out.println("Product Of Diagonal Elements = " + prod);

		sc.close();
	}

}
