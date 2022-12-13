package Array1D;

import java.util.Scanner;

public class FindAverage {
	void average(double a[]) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double average = (sum / a.length);

		System.out.println("Average = " + average);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size ");
		int size = sc.nextInt();

		double arr[] = new double[size];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}

		FindAverage f = new FindAverage();
		f.average(arr);
		
		sc.close();
	}

}
