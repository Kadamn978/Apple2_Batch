package Cointainment_Hierarchical;

public class Daughter extends Father {
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void Education() {
		System.out.println("B.E");
	}
	void Job() {
		System.out.println("Software Engineer");
	}
	void Location() {
		System.out.println("Pune");
	}
}
