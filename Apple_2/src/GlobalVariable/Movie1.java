package GlobalVariable;

import java.util.Scanner;

public class Movie1 {
	
	int id,year;
	String name,producer;
		
	void setData() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Movie Id");
	id=sc.nextInt();
	System.out.println("Enter the Movie Name");
	name=sc.next();
	System.out.println("Enter Year of Release");
	year=sc.nextInt();
	System.out.println("Enter the Producer Name");
	producer=sc.next();
	System.out.println(" ");
	}
	
//	void display() {
//		System.out.println("ID \t Name \t  Release \t Producer");
//		System.out.println(id+" \t "+name+" \t "+year+" \t \t "+producer);
//	}
	
	public String toString() {
		return id+" \t "+name+" \t "+year+" \t \t "+producer;
	}
	
	public static void main(String[] args) {
		Movie1 m= new Movie1();
		m.setData();
//		m.display();
		System.out.println(m);
		
		Movie1 m1= new Movie1();
		m1.setData();
//		m1.display();
		System.out.println(m1);
		
	}

}
