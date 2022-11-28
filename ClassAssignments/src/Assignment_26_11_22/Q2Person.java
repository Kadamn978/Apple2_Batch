package Assignment_26_11_22;

public class Q2Person {
	int age;
	String name, gender;
	Q2Address a;
	
	Q2Person(String name,int age,String gender,Q2Address a ) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.a=a;
	}
	
	@Override
	public String toString() {
		return "Person Details :\n"+"Name :"+name+", Age: "+age+", Gender: "+gender+"\n"+a;
	}
	
}
