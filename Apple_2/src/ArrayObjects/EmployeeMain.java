package ArrayObjects;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No of Employee's Data to Store");
		int size = sc.nextInt();

		Employee emp[] = new Employee[size];

		for (int i = 0; i < emp.length; i++) {
			System.out.println("Enter Employee's Details: ID , Name , Department , Salary");
			int id = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			int sal = sc.nextInt();

			Employee e = new Employee(id, name, dept, sal);
			emp[i] = e;

		}
		System.out.println("Employee Details: ");
		for(Employee e:emp) {
			System.out.println(e);
		}
		System.out.println("\nEmployees With Hr Dept");
		for(Employee e:emp) {
			if(e.dept.equalsIgnoreCase("HR")) {
				System.out.println("Congrats.."+e.name+" ! You will Get 10% Hike");
				e.hike();	
			}
		}
		System.out.println("\nEmployees With Salary Greater Than 60,000 RS.");
		for(Employee e:emp) {
			if(e.sal>=60000) {
				System.out.println(e);
			}
		}
		
		
		sc.close();
	}

}
