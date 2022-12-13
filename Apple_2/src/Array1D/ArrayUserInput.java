package Array1D;

import java.util.Scanner;

public class ArrayUserInput {
	void reversePrinting(int a[]) {
		System.out.println("Array In Reverse Order: ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
	}

	void sumOfElements(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Sum of Array Elements = "+sum);
	}

	void primeNo(int a[]) {
		System.out.println("Prime No. : ");
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println(" \n");
	}
	void primeNoMid(int a[]) {
		System.out.println("Prime No. : ");
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]/2; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println(" \n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array ELements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayUserInput ar = new ArrayUserInput();
		ar.primeNo(arr);
		ar.primeNoMid(arr);
		//ar.reversePrinting(arr);
		//ar.sumOfElements(arr);

		sc.close();
	}

}
