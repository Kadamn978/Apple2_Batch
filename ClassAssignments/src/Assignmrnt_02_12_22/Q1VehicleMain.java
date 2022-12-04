package Assignmrnt_02_12_22;

import java.util.Scanner;

public class Q1VehicleMain {

	public static void main(String[] args) {
		int reg, price;
		String vehiclename, companyname, fueltype, state;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle Name : ");
		vehiclename = sc.next();
		System.out.println("Enter Company Name : ");
		companyname = sc.next();
		System.out.println("Enter Registration No. : ");
		reg = sc.nextInt();
		System.out.println("Enter Registration State Name : ");
		state = sc.next();
		System.out.println("Enter Vehicle Fueltype : ");
		fueltype = sc.next();
		System.out.println("Enter Vehicle Price : ");
		price = sc.nextInt();

		Q1Vehicle v = new Q1Vehicle();
		v.registrationNo(reg, state);
		v.setData(reg, companyname, fueltype, state);
		v.setVehicle(price, vehiclename);
		v.vehicleInfo(companyname, fueltype);

		v.display();

		sc.close();
	}

}
