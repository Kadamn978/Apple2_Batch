package Construcotr;

public class Theater {
	int id, rating;
	String name, address,contact;
	
	Theater(){
		this(20,"Abhi");
		System.out.println("Default Constructor");
	}
	Theater(int id,String name,String address,int rating) {
		this(20,"Abhi","Aura");;
		System.out.println("1st Constructor");
	}
Theater(int id,String name,String address) {
		
	}
Theater(int id,String name) {
	
}
	
	 Theater(int id,String name,String address,int rating,String contact) {
			
			this.id=id;
			this.name=name;
			this.address=address;
			this.rating=rating;
			this.contact=contact;
			
		}
		public String toString() {
			
			return id+" \t "+name+" \t "+address+" \t "+rating+" \t "+contact;
		}


}
