package ClassAndObjectWithReturnType;

import java.util.Scanner;

public class SimpleInterestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount ");
		int p = sc.nextInt();
		System.out.println("Enter Duration in Year");
		float n = sc.nextFloat();
		System.out.println("Enter Rate Of Interest ");
		float r = sc.nextFloat();
		SimpleInterest s= new SimpleInterest();	
		float intrest=s.si(p, n, r);
		System.out.println("Simple Interest = "+String.format("%.2f", intrest));
		System.out.println("Total Amount to Repay = "+String.format("%.2f",intrest+p));
		sc.close();
	}

}
