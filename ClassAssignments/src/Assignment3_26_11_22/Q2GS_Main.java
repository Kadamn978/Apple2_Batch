package Assignment3_26_11_22;

import java.util.Scanner;

public class Q2GS_Main {

	public static void main(String[] args) {
		int age;
		String name, gender, city, state, country;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Person Name");
		name = sc.next();
		System.out.println("Enter Person Age");
		age = sc.nextInt();
		System.out.println("Enter Person Gender");
		gender = sc.next();
		System.out.println("Enter Person City");
		city = sc.next();
		System.out.println("Enter Person State");
		state = sc.next();
		System.out.println("Enter Person Country");
		country = sc.next();

		Q2GS_Address add = new Q2GS_Address();
		add.setCity(city);
		add.setState(state);
		add.setCountry(country);

		Q2GS_Person p = new Q2GS_Person();
		p.setName(name);
		p.setAge(age);
		p.setGender(gender);
		p.setA(add);
		
		System.out.println("Person Details: ");
		System.out.println("Name :"+p.getName()+", Age: "+p.getAge()+", Gender: "+p.getGender()+"\n");
		
		System.out.println("Address Details: ");
		System.out.println("City: "+p.getA().getCity()+",\nState: "+p.getA().getState()+",\nCountry: "
		+p.getA().getCountry());
		
		sc.close();
	}

}
