package Cointainment_Multilevel;

import java.util.Scanner;

public class GrandFatherMain {

	public static void main(String[] args) {
		String firstname, middlename, lastname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter GrandFather Name ");
		firstname = sc.next();
		System.out.println("Enter GrandFather's Middle Name ");
		middlename = sc.next();
		System.out.println("Enter Last Name ");
		lastname = sc.next();

		Child c = new Child();
		c.setFirstname(firstname);
		c.setMiddlename(middlename);
		GrandFather.setLastname(lastname);

		System.out.println("\nEnter Father Name ");
		firstname = sc.next();
		c.setFfirstname(firstname);

		System.out.println("\nEnter Child Name ");
		firstname = sc.next();
		c.setCfirstname(firstname);

		
		
		c.display();

		sc.close();
	}

}
