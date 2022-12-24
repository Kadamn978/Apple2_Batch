package Assignment7_24_12_22;

import java.util.Scanner;

public class Q1DiagonalElementsSum  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter no of Column");
		int col = sc.nextInt();
		int a[][] = new int[rows][col];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array Elements Are: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

		int sum = 0;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j) {
					sum = sum + a[i][j];
				}
			}
		}
		System.out.println("Sum of Major Diagonal Elements = " + sum);

		sc.close();
	}

}
