package Cointainment_Multilevel;

public class Father extends GrandFather {
	String ffirstname;

	public void setFfirstname(String ffirstname) {
		this.ffirstname = ffirstname;
	}
	
	
	void display() {
		super.display();
		System.out.println("\nFather's Full Name : ");
		System.out.println("Name : "+ffirstname+"\t MiddleName : "+super.firstname+"\t LastName : "+lastname);
	}

}
