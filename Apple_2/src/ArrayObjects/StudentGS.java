package ArrayObjects;

public class StudentGS {
	int id,marks;
	String name,dept;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID : "+getId()+",\t Name: "+getName()+",\t Department : "+getDept()+",\t Marks : "+getMarks();
	}
}
