package Inheritance;

public class CarMain {

	public static void main(String[] args) {
		Engine e1 = new Engine(1000, 650, "TATA");

		Car c1 = new Car(100, "Sumo", "TATA", 150000, e1);
		
		Engine e2 = new Engine(1200, 600, "Maruti");
		Car c2 = new Car(100, "Swift", "Maruti", 100000, e2);

		Engine e3 = new Engine(1500, 650, "Hundai");
		Car c3 = new Car(100, "Verna", "Hundai", 180000, e3);

		Engine e4 = new Engine(1000, 500, "TATA");
		Car c4 = new Car(100, "NANO", "TATA", 300000, e4);
		
		System.out.println(c1+" \n");
		System.out.println(c2+" \n");
		System.out.println(c3+" \n");
		System.out.println(c4+" \n");

	}

}
