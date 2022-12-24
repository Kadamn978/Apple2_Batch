package Assignment7_24_12_22;

import java.util.Arrays;
import java.util.Scanner;

public class Q4ReplaceNegativeValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {12, 3, -19, 29, 5, -61, 44, 7, -9};

		System.out.println("Original Array = "+Arrays.toString(a));
//		System.out.println("Enter no of Rows");
//		int size = sc.nextInt();
//		 
//		int a[] = new int[size];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<0) {
				a[i]=(a[i-1]*a[i-1]);
			}
		}
		
		System.out.println("New Array = "+Arrays.toString(a));

		sc.close();
	}

}
