package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingInAscending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Original Array : " + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
			}
		}
		System.out.println("Array in Ascending Order : " + Arrays.toString(a));
		
		sc.close();
	}

}
