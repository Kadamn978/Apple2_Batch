package Assignmrnt_02_12_22;

public class Q1Vehicle extends Q1RTO {
	int price;
	String vehiclename;

	void setVehicle(int price, String vehiclename) {
		this.price = price;
		this.vehiclename = vehiclename;
	}

	void registrationNo(int reg, String state) {
		this.reg = reg;
		this.state = state;
	}

	void vehicleInfo(String companyname, String fueltype) {
		this.companyname = companyname;
		this.fueltype = fueltype;
	}
	
	void display() {
		System.out.println("\nVehicle Info : ");
		System.out.println("Company Name : "+companyname+"\t Name : "+vehiclename+"\t FuelType : "+fueltype+"\t Price : "+price);
		System.out.println("\nRegistration Info : ");
		System.out.println("Registration Number : "+reg+"\t Regustration State : "+state);
	}

}
