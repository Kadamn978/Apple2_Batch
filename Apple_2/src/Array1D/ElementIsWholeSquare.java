package Array1D;

import java.util.Scanner;

public class ElementIsWholeSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No ");
		int n = sc.nextInt();
		int b=1;

		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			if(i<n) {
				a[i]=b;
				//System.out.println("a["+i+"] = "+a[i]);
				b++;
			}
		}
		 b=1;
		System.out.println("Square Root Between 0 to "+(n)+" ");
		for (int i = 0; i < a.length; i++) {
			//int sqrt =(int)sqrt;
			double sqrt=Math.sqrt(b);
			if(sqrt==Math.floor(sqrt)) {
				System.out.print(b+" ");
			}
			b++;
		}
		
		sc.close();
	}

}
