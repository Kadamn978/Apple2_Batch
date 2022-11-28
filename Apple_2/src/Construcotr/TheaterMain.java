package Construcotr;

import java.util.Scanner;

public class TheaterMain {

	public static void main(String[] args) {
		int id, rating;
		String name, address, contact;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Entry");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter Theater ID");
			id = sc.nextInt();
			System.out.println("Enter Theater Name");
			name = sc.next();
			System.out.println("Enter Theater Address");
			address = sc.next();
			System.out.println("Enter Theater Rating");
			rating = sc.nextInt();
			System.out.println("Enter Theater Contact");
			contact = sc.next();

			Theater t = new Theater(id, name, address, rating, contact);
			System.out.println("ID \t Name \t Address \t Rating \t  Contact");
			System.out.println(t + "\n");

		}

		sc.close();
	}

}
