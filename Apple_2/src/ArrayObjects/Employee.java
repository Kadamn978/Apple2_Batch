package ArrayObjects;

public class Employee {
	int id,sal;
	String name,dept;
	
	Employee(int id,String name, String dept,int sal){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	
	void hike() {
		sal=sal+((sal*10)/1000);
		System.out.println("New Salary = "+sal);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID : "+id+", Name: "+name+", Department : "+dept+", Salary : "+sal;
	}

}
