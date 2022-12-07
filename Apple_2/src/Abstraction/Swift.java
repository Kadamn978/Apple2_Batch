package Abstraction;

public abstract class Swift extends Car {
		
	void diaplay() {
		System.out.println("Engine Capacity: "+enginecapacity+"cc, Price: "+price+" Rs.");
	}
	@Override
	void safetyfeatures() {
		System.out.println("Comes with 2 airbags");
		
	}

	@Override
	void headlightNo() {
		System.out.println("2 LED Headlights ");
		
	}

	@Override
	void dashboard() {
		System.out.println("Comes with Touchscreen Musicplayer");
		
	}

}
