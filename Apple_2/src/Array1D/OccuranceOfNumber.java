package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class OccuranceOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Array Size");
		int sizea = sc.nextInt();

		int a[] = new int[sizea];

		System.out.println("Enter First Array Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("First Array : " + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i; j < a.length; j++) {
				
			if (a[i] == a[j]) {
				count++;
				a[i] = 0;
			}
			}
			if(count>1) {
				System.out.println(+a[i]+" has occurd "+count+" times");
			}
		}
		sc.close();
	}

}
