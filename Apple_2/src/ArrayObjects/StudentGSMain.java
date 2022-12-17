package ArrayObjects;

import java.util.Scanner;

public class StudentGSMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No of students Data to Store");
		int size = sc.nextInt();

		StudentGS stud[] = new StudentGS[size];

		System.out.println("Enter Students Details: ID , Name , Department , Marks");
		for (int i = 0; i < stud.length; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			int marks = sc.nextInt();

			StudentGS s = new StudentGS();
			s.setId(id);
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
			stud[i] = s;

		}

		for (StudentGS s : stud) {
			if (s.marks > 55) {
				System.out.println(s);
			}
		}
		sc.close();
	}

}
