package Inheritance;

import java.util.Scanner;

public class PPersonMain {

	public static void main(String[] args) {
		int idno, age;
		String name, idname, contact, address;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person Name");
		name = sc.next();
		System.out.println("Enter Person Age");
		age = sc.nextInt();
		System.out.println("Enter Person Contact");
		contact = sc.next();
		System.out.println("Enter Id No.");
		idno = sc.nextInt();
		System.out.println("Enter Id Name");
		idname = sc.next();
		System.out.println("Enter Address");
		address = sc.next();

		PIdProof id = new PIdProof();
		id.setIdno(idno);
		id.setIdname(idname);
		id.setAddress(address);

		PPerson p = new PPerson();
		p.setName(name);
		p.setAge(age);
		p.setContact(contact);
		p.setPid(id);

		System.out.println("\nPerson Details: ");
		System.out.println("Name: " + p.getName() + ", Age: " + p.getAge() + ", Contact: " + p.getContact() + "\nID Proof: ");
		System.out.println("Id No.: " + p.getPid().getIdno() + "\nID Name: " + p.getPid().getIdname() + "\nAddress: "
				+ p.getPid().getAddress());

		sc.close();
	}

}
