package Assignment_19_11_22;

import java.util.Scanner;

public class NationalGameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Country To Find Its National Sports");
		System.out.println("India \nChina \nBangladesh \nItaly \nUSA");
		System.out.println("\nEnter Your Choice");
		
		String cname=sc.next().toLowerCase();
		
		NationalGame ng= new NationalGame();
		ng.country(cname);
sc.close();
	}

}
