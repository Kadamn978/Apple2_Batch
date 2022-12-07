package Abstraction;

public class SwiftDezire extends Swift{
	 public SwiftDezire(int enginecapacity, int price) {
		this.enginecapacity=enginecapacity;
		this.price=price;
	}

	@Override
	void alloywheel() {
		System.out.println("Comes with ");
		
	}

}
