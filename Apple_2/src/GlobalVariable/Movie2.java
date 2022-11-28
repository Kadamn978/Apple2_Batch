package GlobalVariable;

import java.util.Scanner;

public class Movie2 {

	int id, year;
	String name, producer;

	void setData(int i, String n, int y, String p) {
		id=i;
		name=n;
		year=y;
		producer=p;

	}

//	void display() {
//
//		System.out.println(id + " \t " + name + " \t " + year + " \t \t " + producer);
//	}
	
	public String toString() {
		return id+" \t "+name+" \t "+year+" \t \t "+producer;
	}
	

	public static void main(String[] args) {
		int id, year;
		String name, producer;
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
		
		Movie2 m2=new Movie2();
		m2.setData(id, name, year, producer);
		
		System.out.println("Enter the Movie Id");
		 id=sc.nextInt();
		System.out.println("Enter the Movie Name");
		 name=sc.next();
		System.out.println("Enter Year of Release");
		year=sc.nextInt();
		System.out.println("Enter the Producer Name");
		producer=sc.next();
		System.out.println(" ");
		
		Movie2 m3=new Movie2();
		m3.setData(id, name, year, producer);

		System.out.println("ID \t Name \t  Release \t Producer");
		System.out.println(m2);
		System.out.println(m3);
//		m2.display();
//		m3.display();
				
	 sc.close();	
	}
}
