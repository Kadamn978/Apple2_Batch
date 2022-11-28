package Construcotr;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		int id, price, launchyear;
		String name, company;

		Scanner sc = new Scanner(System.in);

		Car c = new Car();		 //simple Constructor
		System.out.println(c + " \n");
		
		System.out.println("Enter Car ID");
		id = sc.nextInt();
		System.out.println("Enter Car Name");
		name = sc.next();
		System.out.println("Enter Car Company");
		company = sc.next();
		System.out.println("Enter Car Launch Year");
		launchyear = sc.nextInt();
		System.out.println("Enter Car Price");
		price = sc.nextInt();
		Car c1 = new Car(id, name, company, launchyear, price);		// parameterized constructor

		System.out.println("Enter Car ID");
		id = sc.nextInt();
		System.out.println("Enter Car Name");
		name = sc.next();
		System.out.println("Enter Car Company");
		company = sc.next();
		System.out.println("Enter Car Launch Year");
		launchyear = sc.nextInt();
		System.out.println("Enter Car Price");
		price = sc.nextInt();
		Car c2 = new Car(id, name, company, launchyear, price);		// parameterized constructor
		
		System.out.println("ID \t Name \t Company \t Launch \t  Price");

		System.out.println(c1 + " \n");
		System.out.println(c2 + " \n");
		
		sc.close();
	}

}
