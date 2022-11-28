package GlobalVariable;

public class Student {
	int id, marks;
	String name, dept;

	void student() {
		System.out.println(id + " \t " + name + " \t " + dept + " \t " + marks);
	}

	void setData(int i, String n, String d, int m) {
		id = i;
		name = n;
		dept = d;
		marks = m;

	}

	void display() {
		System.out.println(id + " \t " + name + " \t " + dept + " \t " + marks);
	}

}
