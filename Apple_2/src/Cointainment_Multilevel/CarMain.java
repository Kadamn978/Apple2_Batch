package Cointainment_Multilevel;

public class CarMain {

	public static void main(String[] args) {
		Q8 q= new Q8();
		q.setPrice(7845120);
		q.setEnginetype("Diesel");
		
		System.out.println("Qudi Q8 :\nPrice: "+q.getPrice()+", Fule Type: "+q.getEnginetype());
		System.out.println("Other Features: ");
		q.cruseMode();
		q.multiMedia();
		q.ventilatedSeats();
		q.climateControl();
		q.NoOfWheels();
		q.HeadLamps();
		
		

	}

}
