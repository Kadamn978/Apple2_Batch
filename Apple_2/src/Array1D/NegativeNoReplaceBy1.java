package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeNoReplaceBy1 {

	void replaceNo(int a[]) {

		System.out.println("Original Array : " + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				a[i] = 0;	// Replacing negative no with Zero(0)
//				a[i] = a[i+1]*a[i+1];	// Replacing negative no with Next No. Square
//				a[i] = a[i-1]*a[i-1];	// Replacing negative no with Previous No.Square
			}
		}
		System.out.println("New Array : "+Arrays.toString(a));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		NegativeNoReplaceBy1 n= new NegativeNoReplaceBy1();
		n.replaceNo(arr);

		sc.close();
	}

}
