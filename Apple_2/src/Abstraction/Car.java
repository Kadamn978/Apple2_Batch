package Abstraction;

public abstract class Car {
	int price, enginecapacity;
	
	void noOfWheels() {
		System.out.println("Car Has 4 wheels");
	}
	void starRating() {
		System.out.println("Car have  3 star Rating ");
	}

	abstract void safetyfeatures();

	abstract void headlightNo();

	abstract void dashboard();
	
	abstract void alloywheel();

}
