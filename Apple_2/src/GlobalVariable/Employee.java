package GlobalVariable;

public class Employee {
	
	int id,salary;
	String name,dept;
	long contact;
	
	void employee(int i, String n, String d,long cont, int sal ) {
		id=1;
		name=n;
		dept=d;
		contact=cont;
		salary=sal;
	}
	
	void display() {
		System.out.println(id+" \t "+name+" \t "+dept+" \t "+contact+" \t "+salary);
	}

}
