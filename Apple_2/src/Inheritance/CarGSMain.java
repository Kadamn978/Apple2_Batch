package Inheritance;

public class CarGSMain {

	public static void main(String[] args) {
		EngineGS e1 = new EngineGS();
		e1.setPower(1000);
		e1.setTorque(650);
		e1.setCname("Tata");

		CarGS c1 = new CarGS();
		c1.setId(100);
		c1.setName("Sumo");
		c1.setCname("TATA");
		c1.setPrice(150000);
		c1.setE(e1);

		EngineGS e2 = new EngineGS();
		e2.setPower(2000);
		e2.setTorque(850);
		e2.setCname("Mercediz");

		CarGS c2 = new CarGS();
		c2.setId(101);
		c2.setName("C350");
		c2.setCname("Mercediz");
		c2.setPrice(550000);
		c2.setE(e2);

		EngineGS e3 = new EngineGS();
		e3.setPower(1500);
		e3.setTorque(950);
		e3.setCname("Jaguar");

		CarGS c3 = new CarGS();
		c3.setId(102);
		c3.setName("XF");
		c3.setCname("Jaguar");
		c3.setPrice(850000);
		c3.setE(e3);

//		System.out.println("Engine Details:\nPower"+e1.getPower()+"\nTorque "+e1.getTorque()+"\nCompany Name "+e1.getCname());
		System.out.println("Car Details:\n Name: " + c1.getName() + ", Company Name: " + c1.getCname() + ", Price: "+ c1.getPrice() + ", \n" +"ENgine Details:\nComany: "+c1.getE().getCname()+"\nPower: "+ c1.getE().getPower()+"\nTorque: "+ c1.getE().getTorque());
		
		System.out.println("  ");
		
		System.out.println("Car Details:\n Name: " + c2.getName() + ", Company Name: " + c2.getCname() + ", Price: "+ c2.getPrice() + ", \n" +"ENgine Details:\nComany: "+c2.getE().getCname()+"\nPower: "+ c2.getE().getPower()+"\nTorque: "+ c2.getE().getTorque());
		
		System.out.println("   ");
		
		System.out.println("Car Details:\n Name: " + c3.getName() + ", Company Name: " + c3.getCname() + ", Price: "+ c3.getPrice() + ", \n" +"ENgine Details:\nComany: "+c3.getE().getCname()+"\nPower: "+ c3.getE().getPower()+"\nTorque: "+ c3.getE().getTorque());

	}

}
