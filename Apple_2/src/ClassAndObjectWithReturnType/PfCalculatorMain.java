package ClassAndObjectWithReturnType;

import java.util.Scanner;

public class PfCalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary Of Employee");
		int sal = sc.nextInt();
		System.out.println("Enter Rating Of Employee");
		char rating = sc.next().charAt(0);

		SalaryHike sh = new SalaryHike();

		PfCalculator p = new PfCalculator();
		System.out.println("****    Hike Calculation    ****");
		float newsal = sh.shike(sal, rating);
		System.out.println("\n****    Pf Calculation    ****");
		p.pfcal(newsal);
		System.out.println("\n****    Bonus Canculation    ****");
		sh.bonus(newsal, rating);
		sc.close();
	}

}
