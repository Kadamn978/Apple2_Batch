package Construcotr;

public class Car {
	int id,price,launchyear;
	String name,company;
	
	Car(){
		
		id=100;
		name="City";
		company="Honda";
		launchyear=2000;
		price=1500000;
		
	}
	
	Car(int id,String name,String company,int launchyear,int price) {
		
		this.id=id;
		this.name=name;
		this.company=company;
		this.launchyear=launchyear;
		this.price=price;
		
	}
	public String toString() {
		
		return id+" \t "+name+" \t "+company+" \t "+launchyear+" \t "+price;
	}

}
