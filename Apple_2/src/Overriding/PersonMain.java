package Overriding;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person Name");
		String name = sc.next();
		System.out.println("Enter Person Age");
		int age = sc.nextInt();
		System.out.println("Enter Person Contact");
		String contact = sc.next();
		System.out.println("Enter Person Gender");
		String gender = sc.next();
		Doctor d = new Doctor();
		System.out.println("Enter Doctor ID");
		int id = sc.nextInt();
		System.out.println("Enter Doctor Specialization");
		String specialization = sc.next();
		System.out.println("Enter Doctor Licence No.");
		int licenceno = sc.nextInt();
		d.setName(name);
		d.setAge(age);
		d.setGender(gender);
		d.setContact(contact);
		d.setId(id);
		d.setSpecialization(specialization);
		d.setLicenceno(licenceno);

		System.out.println("------------------------------------\n");

		System.out.println("Enter Person Name");
		name = sc.next();
		System.out.println("Enter Person Age");
		age = sc.nextInt();
		System.out.println("Enter Person Contact");
		contact = sc.next();
		System.out.println("Enter Person Gender");
		gender = sc.next();
		Patient p = new Patient();
		System.out.println("Enter Patint ID");
		id = sc.nextInt();
		System.out.println("Enter Patient Disease");
		String disease = sc.next();
		System.out.println("Enter Patient Bed No.");
		int bedno = sc.nextInt();
		p.setName(name);
		p.setAge(age);
		p.setGender(gender);
		p.setContact(contact);
		p.setId(id);
		p.setDisease(disease);
		p.setBedno(bedno);

		System.out.println("------------------------------------\n");
		d.display();
		System.out.println("------------------------------------\n");
		p.display();

		sc.close();
	}

}
