package Abstraction;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Engine capacity");
		int engine = sc.nextInt();
		System.out.println("Enter Price");
		int price = sc.nextInt();
		SwiftDezire s = new SwiftDezire(engine, price);
		s.diaplay();
		s.safetyfeatures();
		s.headlightNo();
		s.dashboard();
		s.noOfWheels();
		s.starRating();

		sc.close();
	}

}
