package Assignment4_02_12_22;

public class Q1Student extends Q1Person {
	
	private int rollno,m1,m2,m3,m4,m5;
	void setRollNo(int rollno) {
		this.rollno=rollno;
	}
	void setMarks(int m1,int m2,int m3,int m4,int m5) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
	}
	void displayPersonDetails() {
		System.out.println("Name : "+name+"\t Age : "+age+"\t Contact : "+contact);
	}
	void displayStudentDetails() {
		System.out.println("Roll no.: "+rollno+"\n Subject 1 : "+m1+"\n Subject 2 : "+m2+
				"\n Subject 3 : "+m3+"\n Subject 4 : "+m4+"\n Subject 5 : "+m5);
	}
	
	void percentage() {
		float perc=((m1+m2+m3+m4+m5)/500f)*100;
		System.out.println("Percentage Obtain : "+perc);
	}
	
}
