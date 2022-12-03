package Overriding;

public class Doctor extends Person {
	int id, licenceno;
	String specialization;

	public void setId(int id) {
		this.id = id;
	}

	public void setLicenceno(int licenceno) {
		this.licenceno = licenceno;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	void display() {
		System.out.println("Doctors Details : ");
		System.out.print("ID: "+id);
		super.display();
		System.out.println("Specialization : "+specialization+", Licence NO.: "+licenceno);

	}
}
