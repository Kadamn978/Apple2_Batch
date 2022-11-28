package ClassAndObjects;

import java.util.Scanner;

public class SalaryHikeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary Of Employee");
		int sal=sc.nextInt();
		System.out.println("Enter Rating Of Employee");
		char rating = sc.next().charAt(0);
		
		SalaryHike sh =new SalaryHike();
		sh.hike(sal, rating);
sc.close();
	}

}
