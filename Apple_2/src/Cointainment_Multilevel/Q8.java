package Cointainment_Multilevel;

public class Q8 extends Audi{
	int price;
	String enginetype;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getEnginetype() {
		return enginetype;
	}
	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}
	
	void cruseMode() {
		System.out.println("Comes with Cruse Control");
	}
	void multiMedia() {
		System.out.println("Comes with Android Play Multimedia System with 8in Touch Screen display");
	}

}
