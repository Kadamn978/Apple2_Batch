package Assignment_12_11_22;

import java.util.Scanner;

public class BaseAndPower {
	// Q.4- WAP to accept base and index from user and calculates power

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base ");
		int b = sc.nextInt();
		System.out.println("Enter Index");
		int p = sc.nextInt();
		int res = 1;
		for (int i = 1; i <= p; i++) {
			res = res * b;
		}
		System.out.println(res);
		sc.close();
	}

}
