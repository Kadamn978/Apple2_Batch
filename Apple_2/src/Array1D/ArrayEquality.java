package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Array Size");
		int sizea = sc.nextInt();

		int a[] = new int[sizea];

		System.out.println("Enter First Array Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter Second Array Size");
		int sizeb = sc.nextInt();

		int b[] = new int[sizeb];

		System.out.println("Enter Second Array Elements");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}

		System.out.println("First Array : " + Arrays.toString(a));
		System.out.println("Second Array : " + Arrays.toString(b));

		if (a.length == b.length) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
//				for (int j = 0; j < b.length; j++) {
					if (a[i] == b[i]) {
						count++;
//					}
				}
			}
			if (count == a.length) {
				System.out.println("Both Array Are Same");
			} 
			else {
				System.out.println("Both Array Are Not Same");
			}

		} 
		else {
			System.out.println("Array Length is Not Same");
		}

		sc.close();
	}

}
