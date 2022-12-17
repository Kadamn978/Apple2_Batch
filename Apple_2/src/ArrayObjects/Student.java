package ArrayObjects;

public class Student {
	int id,marks;
	String name,dept;
	
	public Student(int id,String name,String dept,int marks) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return "ID : "+id+",\t Name: "+name+",\t Department : "+dept+",\t Marks : "+marks;
	}

}
