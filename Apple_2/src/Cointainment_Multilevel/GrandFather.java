package Cointainment_Multilevel;

public class GrandFather {
	static String lastname;
	String firstname, middlename;

	public static void setLastname(String lastname) {
		GrandFather.lastname = lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	
	void display() {
		System.out.println("\nGrandFather's Full Name : ");
		System.out.println("Name : "+firstname+"\t MiddleName : "+middlename+"\t LastName : "+lastname);
	}

}
