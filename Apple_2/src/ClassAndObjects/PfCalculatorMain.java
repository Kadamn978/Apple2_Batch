package ClassAndObjects;

import java.util.Scanner;

public class PfCalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary Of Employee");
		int sal = sc.nextInt();
		PfCalculator cal = new PfCalculator();
		cal.pfcal(sal);
		
		
		sc.close();
	}

}
