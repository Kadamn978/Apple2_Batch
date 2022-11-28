package Encapsulation;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Employee Department");
		String dept = sc.next();
		System.out.println("Enter Employee Email");
		String email = sc.next();
		System.out.println("Enter Employee Salary");
		int salary = sc.nextInt();

		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setDept(dept);
		e.setEmail(email);
		e.setSalary(salary);

		System.out.println("Enter Employee ID");
		id = sc.nextInt();
		System.out.println("Enter Employee Name");
		name = sc.next();
		System.out.println("Enter Employee Department");
		dept = sc.next();
		System.out.println("Enter Employee Email");
		email = sc.next();
		System.out.println("Enter Employee Salary");
		salary = sc.nextInt();

		Employee e1 = new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setDept(dept);
		e1.setEmail(email);
		e1.setSalary(salary);
		
		System.out.println("ID \t Name \t Department \t Email \t Salary");
		System.out.println(e.getId()+" \t "+e.getName()+" \t "+e.getDept()+" \t "+e.getEmail()+" \t "+e.getSalary());
		System.out.println(e1.getId()+" \t "+e1.getName()+" \t "+e1.getDept()+" \t "+e1.getEmail()+" \t "+e1.getSalary());

		sc.close();
	}

}
