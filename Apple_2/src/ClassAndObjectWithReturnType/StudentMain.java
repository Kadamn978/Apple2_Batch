package ClassAndObjectWithReturnType;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("Enter 5 Subject Marks out of 100");
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();

		Student s = new Student();
		float perc =s.Percentage(s1, s2, s3, s4, s5);
		s.Grade(perc);
		sc.close();
	}
}
