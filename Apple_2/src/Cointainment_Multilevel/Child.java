package Cointainment_Multilevel;

public class Child extends Father {
	String cfirstname;

	public void setCfirstname(String cfirstname) {
		this.cfirstname = cfirstname;
	}


	void display() {
		super.display();
		System.out.println("\nChild's Full Name : ");
		System.out.println("Name : " + cfirstname + "\t MiddleName : " + super.ffirstname + "\t LastName : " + lastname);
	}

}
