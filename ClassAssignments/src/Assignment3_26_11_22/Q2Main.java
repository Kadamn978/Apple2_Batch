package Assignment3_26_11_22;

import java.util.Scanner;

public class Q2Main {
//	Q2. Create class Person which has attributes (name, gender, age, Address). 
//		Address is class which has attributes (city, state, country). Display Persons data
//		Note. Containment using constructor and getter/setter
	
	public static void main(String[] args) {
		int age;
		String name, gender, city, state, country;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Person Name");
		name = sc.next();
		System.out.println("Enter Person Age");
		age = sc.nextInt();
		System.out.println("Enter Person Gender");
		gender = sc.next();
		System.out.println("Enter Person City");
		city = sc.next();
		System.out.println("Enter Person State");
		state = sc.next();
		System.out.println("Enter Person Country");
		country = sc.next();

		Q2Address add = new Q2Address(city, state, country);
		Q2Person p = new Q2Person(name, age, gender, add);

		System.out.println(p);
		sc.close();
	}

}
