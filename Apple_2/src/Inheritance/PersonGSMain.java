package Inheritance;

public class PersonGSMain {

	public static void main(String[] args) {
		
		AddressGS a1=new AddressGS();
		a1.setArea("CIDCO");
		a1.setCity("Aurangabad");
		a1.setState("Maharashtra");
		a1.setPincode(431001);
		PersonGS p1=new PersonGS();
		p1.setId(100);
		p1.setName("Lallan");
		p1.setContact("7234567890");
		p1.setAge(55);
		p1.setAdd(a1);
		
		AddressGS a2=new AddressGS();
		a2.setArea("Hinjewadi");
		a2.setCity("Pune");
		a2.setState("Maharashtra");
		a2.setPincode(411030);
		PersonGS p2=new PersonGS();
		p2.setId(101);
		p2.setName("Manoj");
		p2.setContact("7264567890");
		p2.setAge(25);
		p2.setAdd(a2);
		
		AddressGS a3=new AddressGS();
		a3.setArea("Wakad");
		a3.setCity("Pune");
		a3.setState("Maharashtra");
		a3.setPincode(411001);
		PersonGS p3=new PersonGS();
		p3.setId(102);
		p3.setName("Shree");
		p3.setContact("7234451890");
		p3.setAge(55);
		p3.setAdd(a3);
		
		System.out.println("Name:"+p1.getName()+"\nContact: "+p1.getContact()+"\nAddress:");
		System.out.println("Area: "+p1.getAdd().getArea()+"\nCity: "+p1.getAdd().getCity()+"\nState: "
		+p1.getAdd().getState()+"\nPincode:"+p1.getAdd().getPincode()+"\n");
		
		System.out.println("Name:"+p2.getName()+"\nContact: "+p2.getContact()+"\nAddress:");
		System.out.println("Area: "+p2.getAdd().getArea()+"\nCity: "+p2.getAdd().getCity()+"\nState: "
		+p2.getAdd().getState()+"\nPincode:"+p2.getAdd().getPincode()+"\n");
		
		System.out.println("Name:"+p3.getName()+"\nContact: "+p3.getContact()+"\nAddress:");
		System.out.println("Area: "+p3.getAdd().getArea()+"\nCity: "+p3.getAdd().getCity()+"\nState: "
		+p3.getAdd().getState()+"\nPincode:"+p3.getAdd().getPincode()+"\n");
	}

}
