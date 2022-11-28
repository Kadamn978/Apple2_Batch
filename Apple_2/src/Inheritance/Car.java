package Inheritance;

public class Car {
	int id,price;
	String name,cname;
	Engine e;
	
	public Car(int id,String name, String cname,int price, Engine e) {
		this.id=id;
		this.name=name;
		this.cname=cname;
		this.price=price;
	}
	
	@Override
	public String toString() {
		
		return "Car Details:\n Name :"+name+" Company Name :"+cname+" Price :"+price+" \n"+e;
	}

}
