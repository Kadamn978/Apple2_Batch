package ThisKeyword;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		int id,price,launchyear;
		String name,company;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("No Of Entry You want to Enter");
		int ch=sc.nextInt();
		for(int i=1;i<=ch;i++) {
			System.out.println("Enter Car ID");
			 id=sc.nextInt();
			System.out.println("Enter Car Name");
			 name=sc.next();
			System.out.println("Enter Car Company");
			 company=sc.next();
			System.out.println("Enter Car Launch Year");
			 launchyear=sc.nextInt();
			System.out.println("Enter Car Price");
			 price=sc.nextInt();

			 System.out.println(" ");
			 
			 Car c=new Car();
			 c.carDetails(id, name, company, launchyear, price);
			 System.out.println("ID \t Name \t Company   LaunchYear   Price");
			 System.out.println(c+" \n");
			
		}
sc.close();
	}

}
