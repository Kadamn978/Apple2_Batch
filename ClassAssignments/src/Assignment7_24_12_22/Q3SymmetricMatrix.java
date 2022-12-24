package Assignment7_24_12_22;

import java.util.Scanner;

public class Q3SymmetricMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter no of Column");
		int col = sc.nextInt();

		int a[][] = new int[rows][col];

		// Array A Elements
		System.out.println("Enter Array Elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// Array B Elements
		int b[][] = new int[col][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				b[j][i] = a[i][j];
			}
		}

		// Printing Array A Elements
		System.out.println("Array A Elements Are: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

		// Printing Array B Elements
		System.out.println("Array B Elements Are: ");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}

		// Checking IF Matrix B is Transpose Of Matrix A
		int count = 0;
		if (rows == col) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < col; j++) {
					if (a[i][j] == b[j][i]) {
						count++;
					}
				}
			}
		}

		// Printing IF Matrix is Symmetric Matrix or Not
		if (count == a.length) {
			System.out.println("Entered Matrix is Symmetric Matrix ");
		} else {
			System.out.println("Entered Matrix is Not Symmetric Matrix ");
		}

		sc.close();
	}

}
