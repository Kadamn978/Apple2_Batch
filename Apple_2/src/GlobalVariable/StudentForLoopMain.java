package GlobalVariable;

import java.util.Scanner;

public class StudentForLoopMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, m, num;
		String n, d;
		System.out.println("Enter Nuber of Student's Data You want to Enter");
		num = sc.nextInt();

		for (int j = 1; j <= num; j++) {
			System.out.println("\nEnter the data for " + j + " Student");

			System.out.println("\nEnter Student ID");
			i = sc.nextInt();
			System.out.println("Enter Student Name");
			n = sc.next();
			System.out.println("Enter Student Dept");
			d = sc.next();
			System.out.println("Enter Student Marks");
			m = sc.nextInt();

			Student s = new Student();

			s.setData(i, n, d, m);

			System.out.println("\nID \t Name \t Dept \t Marks ");
			s.display();

			System.out.println(" ");
		}
		sc.close();
	}

}
