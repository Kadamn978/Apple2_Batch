package Assignmrnt_02_12_11;

import java.util.Scanner;

public class Q1PersonMain {
	public static void main(String[] args) {
		int age, rollno, m1, m2, m3, m4, m5;
		String name, contact;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter Age");
		age = sc.nextInt();
		System.out.println("Enter Contact");
		contact = sc.next();
		System.out.println("Enter Roll No.");
		rollno = sc.nextInt();
		System.out.println("Enter Subject 1 Marks");
		m1 = sc.nextInt();
		System.out.println("Enter Subject 2 Marks");
		m2 = sc.nextInt();
		System.out.println("Enter Subject 3 Marks");
		m3 = sc.nextInt();
		System.out.println("Enter Subject 4 Marks");
		m4 = sc.nextInt();
		System.out.println("Enter Subject 5 Marks");
		m5 = sc.nextInt();

		Q1Student s = new Q1Student();
		s.setData(name, age, contact);
		s.setRollNo(rollno);
		s.setMarks(m1, m2, m3, m4, m5);
		s.displayPersonDetails();
		s.displayStudentDetails();
		s.percentage();

		sc.close();
	}
}
