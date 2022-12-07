package Abstraction;

public class TV extends Electronics {

	public void setaData(int price, int weight, String color) {
		this.price = price;
		this.weight = weight;
		this.color = color;
	}

	void powerRating() {
		System.out.println("\nPower Rating : ");
		System.out.println("Most LED TV's has rated power between 60 watt to 150 watt.");
	}

	void electricityConsumption() {
		System.out.println("\nElectricity Consumption  : ");
		System.out.println("A 100 watt TV running for 12 hours everyday will consume"
				+ " 1200 watt hours = 1.2 kWh (units) of electricity in a day");
	}

	void features() {
		System.out.println("\nFeatures : ");
		System.out.println(" Video Streaming Services.\n" + " Streaming UHD Video in 4K.\n"
				+ " Online music streaming.\n" + " Media Player.\n" + " A Universal Search Engine.\n" 
				+ " App Store.");
	}

	void display() {
		System.out.println("\nTv Information : ");
		System.out.println(" Price : " + price + "\t Color  : " + color + "\t Weight : " + weight+" Kg.");
	}
}
