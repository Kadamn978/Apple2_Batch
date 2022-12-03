package Overriding;

public class Person {
	int age;
	String contact, name, gender;

	public void setAge(int age) {
		this.age = age;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	void display() {
		System.out.println(" Name : " + name + ", Age : " + age + ", Gender : " + gender + ", Contact : " + contact);
	}
}
