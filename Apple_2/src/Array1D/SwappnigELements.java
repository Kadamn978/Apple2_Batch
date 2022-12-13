package Array1D;

import java.util.Arrays;

public class SwappnigELements {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Original Array : "+Arrays.toString(a));
		for (int i = 0; i < a.length/2; i++) {
			int c=a[i];
			a[i]=a[(a.length/2)+i];
			a[(a.length/2)+i]=c;
		}
		System.out.println("Array After Swapping: "+Arrays.toString(a));

	}

}
