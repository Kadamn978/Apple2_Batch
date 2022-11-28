package GlobalVariable;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,m;
		String n,d;
		
		Student s1 = new Student();
		s1.id = 101;
		s1.name = "Raj";
		s1.dept = "Mech";
		s1.marks = 80;
		
		
		System.out.println("Enter Student ID");
		 i = sc.nextInt();
		System.out.println("Enter Student Name");
		 n = sc.next();
		System.out.println("Enter Student Dept");
		 d = sc.next();
		System.out.println("Enter Student Marks");
		 m = sc.nextInt();
		Student s2 = new Student();
		s2.setData(i, n, d, m);
		
		
		System.out.println("\nEnter Student ID");
		 i = sc.nextInt();
		System.out.println("Enter Student Name");
		 n = sc.next();
		System.out.println("Enter Student Dept");
		 d = sc.next();
		System.out.println("Enter Student Marks");
		 m = sc.nextInt();
		Student s3 = new Student();
		s3.setData(i, n, d, m);
		
		
		System.out.println("\nEnter Student ID");
		 i = sc.nextInt();
		System.out.println("Enter Student Name");
		 n = sc.next();
		System.out.println("Enter Student Dept");
		 d = sc.next();
		System.out.println("Enter Student Marks");
		 m = sc.nextInt();
		Student s4 = new Student();
		s4.setData(i, n, d, m);
		
		
		System.out.println("\nEnter Student ID");
		 i = sc.nextInt();
		System.out.println("Enter Student Name");
		 n = sc.next();
		System.out.println("Enter Student Dept");
		 d = sc.next();
		System.out.println("Enter Student Marks");
		 m = sc.nextInt();
		Student s5 = new Student();
		s5.setData(i, n, d, m);
		
		
		
		System.out.println("\nEnter Student ID");
		 i = sc.nextInt();
		System.out.println("Enter Student Name");
		 n = sc.next();
		System.out.println("Enter Student Dept");
		 d = sc.next();
		System.out.println("Enter Student Marks");
		 m = sc.nextInt();
		Student s6 = new Student();
		s6.setData(i, n, d, m);
		
		System.out.println("\nID \t Name \t Dept \t Marks ");
		s1.student();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		s6.display();
		
		sc.close();
	}

}
