package Overriding;

public class Patient extends Person {
	int id, bedno;
	String disease;

	public void setId(int id) {
		this.id = id;
	}

	public void setBedno(int bedno) {
		this.bedno = bedno;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}
	void display() {
		System.out.println("Patient Details : ");
		System.out.print("ID: "+id);
		super.display();
		System.out.println("Disease : "+disease+", Bed NO.: "+bedno);

	}
}
