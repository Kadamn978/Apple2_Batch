package Abstraction;

import java.util.Scanner;

public class ElectronicsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price, weight;
		String color;

		System.out.println("Enter Tv Price");
		price = sc.nextInt();
		System.out.println("Enter Tv Color");
		color = sc.next();
		System.out.println("Enter Tv Weight");
		weight = sc.nextInt();

		TV t = new TV();
		t.setaData(price, weight, color);

		t.display();
		t.powerRating();
		t.electricityConsumption();
		t.features();
		sc.close();
	}

}
