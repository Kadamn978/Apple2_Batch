package ArrayObjects;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No of students Data to Store");
		int size = sc.nextInt();

		Student stud[] = new Student[size];

		for (int i = 0; i < stud.length; i++) {
			System.out.println("Enter Students Details: ID , Name , Department , Marks");
			int id = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			int marks = sc.nextInt();

			Student s = new Student(id, name, dept, marks);
			stud[i] = s;

		}

		for (Student s : stud) {
			if (s.marks > 55) {
				System.out.println(s);
			}
		}
		sc.close();
	}

}
