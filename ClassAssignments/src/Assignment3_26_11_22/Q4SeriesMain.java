package Assignment3_26_11_22;

import java.util.Scanner;

public class Q4SeriesMain {
//	Q4. Design a class to overload a function series() as follows:
//		(i) double series(double n) with one double argument and returns the sum of the series,
//			sum = 1 / 1 + 1 / 2 + 1 / 3 + … + 1 / n.
//		(ii) double series(double a, double n) with two double arguments and returns the sum of the series,
//			sum = 1 / a2 + 4 / a5 + 7 / a8 + 10 / a11 + … to n terms.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		double n = sc.nextInt();
		System.out.println("Enter value of a");
		double a = sc.nextInt();

		Q4Series s = new Q4Series();
		double sum = s.series(n);
		double sum1 = s.series(a, n);
		
		System.out.println("Series (1/n) ");
		System.out.println("Sum =" + sum);
		System.out.println("\nSeries (1/a^n) ");
		System.out.println("Sum =" + sum1);
		sc.close();
	}

}
