package Cointainment_Hierarchical;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		int id, age, salary;
		double percent;
		String name, contact, college, sub;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Person ID");
		id = sc.nextInt();
		System.out.println("Enter Person Name");
		name = sc.next();
		System.out.println("Enter Person Age");
		age = sc.nextInt();
		System.out.println("Enter Person Contact");
		contact = sc.next();

		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setContact(contact);
		System.out.println("Enter Student College");
		college = sc.next();
		System.out.println("Enter Student Percentage");
		percent = sc.nextDouble();
		s.setCollege(college);
		s.setPercent(percent);
		System.out.println("------------------------------\nStudent Information : ");
		System.out.println("ID :" + s.getId() + ", Name: " + s.getName() + ", Age: " + s.getAge() + ", Contact: "
				+ s.getContact());
		System.out.println("College: " + s.getCollege() + ", Percentage: " + s.getPercent()+" %");
		s.Grade(percent);

		System.out.println("------------------------------\n");

		System.out.println("Enter Person ID");
		id = sc.nextInt();
		System.out.println("Enter Person Name");
		name = sc.next();
		System.out.println("Enter Person Age");
		age = sc.nextInt();
		System.out.println("Enter Person Contact");
		contact = sc.next();
		Faculty f = new Faculty();
		f.setId(id);
		f.setName(name);
		f.setAge(age);
		f.setContact(contact);
		System.out.println("Enter Teaching Subject");
		sub = sc.next();
		System.out.println("Enter Salary");
		salary = sc.nextInt();
		f.setSub(sub);
		f.setSalary(salary);
		System.out.println("------------------------------\nFaculty Information : ");
		System.out.println("ID :" + f.getId() + ", Name: " + f.getName() + ", Age: " + f.getAge() + ", Contact: "
				+ f.getContact());
		System.out.println("Subject : " + f.getSub() + ", Salary: " + f.getSalary());
		f.pfCalculator(salary);

		sc.close();
	}

}
