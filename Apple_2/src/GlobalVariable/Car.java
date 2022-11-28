package GlobalVariable;

public class Car {
	int id,price,launchyear;
	String name,company;
	
	void carDetails(int i,String n,String comp,int lyear,int p) {
		
		id=i;
		name=n;
		company=comp;
		launchyear=lyear;
		price=p;
		
	}
	public String toString() {
		
		return id+" "+name+"   "+company+"   "+launchyear+"   "+price;
	}

}
