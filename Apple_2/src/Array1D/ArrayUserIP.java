package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserIP {

	void evenElement(int a[]) {
		System.out.println("Even elements of Array are : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}

	void oddElement(int a[]) {
		System.out.println("Odd elements of Array are : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array Elements are : ");
		System.out.println(Arrays.toString(arr));

		System.out.println(" ");
		ArrayUserIP a = new ArrayUserIP();
		a.evenElement(arr);
		System.out.println("\n");
		a.oddElement(arr);
		System.out.println("\n");
		
		sc.close();
	}

}
