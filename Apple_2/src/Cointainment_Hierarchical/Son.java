package Cointainment_Hierarchical;

public class Son extends Father{
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
		System.out.println("B.Com");
	}
	void Job() {
		System.out.println("CA");
	}
	void Location() {
		System.out.println("Banglore");
	}

}
