          package GlobalVariable;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id, sal;
		String name, dept;
		long contact;

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();

			System.out.println("Enter Employee ID");
			id = sc.nextInt();
			System.out.println("Enter Employee Name");
			name = sc.next();
			System.out.println("Enter Employee Dept");
			dept = sc.next();
			System.out.println("Enter Employee Contact");
			contact = sc.nextLong();
			System.out.println("Enter Employee Salary");
			sal = sc.nextInt();
			e1.employee(id, name, dept, contact, sal);
			
			
			System.out.println("\nEnter Employee ID");
			id = sc.nextInt();
			System.out.println("Enter Employee Name");
			name = sc.next();
			System.out.println("Enter Employee Dept");
			dept = sc.next();
			System.out.println("Enter Employee Contact");
			contact = sc.nextLong();
			System.out.println("Enter Employee Salary");
			sal = sc.nextInt();
			e2.employee(id, name, dept, contact, sal);
			
			
			System.out.println("\nEnter Employee ID");
			id = sc.nextInt();
			System.out.println("Enter Employee Name");
			name = sc.next();
			System.out.println("Enter Employee Dept");
			dept = sc.next();
			System.out.println("Enter Employee Contact");
			contact = sc.nextLong();
			System.out.println("Enter Employee Salary");
			sal = sc.nextInt();
			e3.employee(id, name, dept, contact, sal);
			
			
			System.out.println("\nEnter Employee ID");
			id = sc.nextInt();
			System.out.println("Enter Employee Name");
			name = sc.next();
			System.out.println("Enter Employee Dept");
			dept = sc.next();
			System.out.println("Enter Employee Contact");
			contact = sc.nextLong();
			System.out.println("Enter Employee Salary");
			sal = sc.nextInt();
			e4.employee(id, name, dept, contact, sal);
			
			
			System.out.println("\nEnter Employee ID");
			id = sc.nextInt();
			System.out.println("Enter Employee Name");
			name = sc.next();
			System.out.println("Enter Employee Dept");
			dept = sc.next();
			System.out.println("Enter Employee Contact");
			contact = sc.nextLong();
			System.out.println("Enter Employee Salary");
			sal = sc.nextInt();
			e5.employee(id, name, dept, contact, sal);
			
			
			
			System.out.println("ID \t Name \t Dept \t Contact \t Salary");
			e1.display();
			e2.display();
			e3.display();
			e4.display();
			e5.display();
		sc.close();
	}

}
