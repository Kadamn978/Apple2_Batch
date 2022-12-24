package Assignment7_24_12_22;

import java.util.Arrays;
import java.util.Scanner;

public class Q5MinCharInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a[] = { 'A', 'D', 'E', 'x', 'z', 'R' };
		//Arrays.sort(a);
		//System.out.println("Min Char in Array = "+a[0]);

		System.out.println("Original Array = " + Arrays.toString(a));
//		System.out.println("Enter no of Rows");
//		int size = sc.nextInt();
//		 
//		int a[] = new int[size];

		for (int j = 0; j < a.length; j++) {
			
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				char temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
	}

		System.out.println("New Array = " + Arrays.toString(a));
		System.out.println("Min Char in Array = "+a[0]);

		sc.close();
	}

}
