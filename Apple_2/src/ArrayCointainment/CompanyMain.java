package ArrayCointainment;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No Of Company");

		int size = sc.nextInt();
		Company comp[] = new Company[size];

		for (int i = 0; i < comp.length; i++) {
			System.out.println("Enter Company Details ID Name");
			int cid = sc.nextInt();
			String cname = sc.next();

			System.out.println("Enter No Of Departments");
			int dsize = sc.nextInt();
			Department d[] = new Department[dsize];

			for (int j = 0; j < d.length; j++) {
				System.out.println("Enter Department Details: ID, Name, No. of Employees in Department");
				int did = sc.nextInt();
				String dname = sc.next();
				int empno = sc.nextInt();
				d[j] = new Department(did, dname, empno);
			}
			comp[i] = new Company(cid, cname, d);
		}

		for (Company c : comp) {
			System.out.println(c);
		}

		sc.close();
	}

}
