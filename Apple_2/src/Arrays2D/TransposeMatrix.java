package Arrays2D;

import java.util.Scanner;

public class TransposeMatrix {

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

		System.out.println("Array A Elements are : ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}

		int b[][] = new int[col][rows];

		for (int i = 0; i < col; i++) {
			for (int j = 0; j < rows; j++) {
				b[i][j] = a[j][i];
			}
		}

		System.out.println("Array B Elements are : ");

		for (int i = 0; i < col; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println(" ");
		}

//		Array A without Temp Array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				if (i != j && i < j) {
					int c = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = c;
				}
			}
		}
		
		System.out.println("Array A Transpose Elements are : ");

		for (int i = 0; i < col; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println(" ");
		}

		sc.close();
	}

}
