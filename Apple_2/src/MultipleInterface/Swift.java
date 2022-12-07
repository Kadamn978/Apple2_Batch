package MultipleInterface;

public class Swift implements TestCar {

	@Override
	public void milage() {
		System.out.println("Swift has 19.5kmpl milage");
	}

	@Override
	public void crash() {
		System.out.println("Swift has 3 star Crash Test Rating");
		
	}

	@Override
	public void speedtest() {
		System.out.println("Swift runs stable on 120km/hr ");
		
	}

	@Override
	public void breaking() {
		System.out.println("Swift Comes With CBS-ABD Technique");
	}

	@Override
	public void loadtest() {
		System.out.println("Swift can Carry Load Upto 150Kg");
	}
	
	public void HeadLamps() {
		System.out.println("Swift Comes with Projected Headlamps");
	}

}
