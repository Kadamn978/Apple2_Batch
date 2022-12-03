package Assignmrnt_02_12_11;

import java.util.Scanner;

public class Q3PersonMain {

	public static void main(String[] args) {
		int idnumber, idvalidity, id;
		String name, contact, address, idname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Person ID");
		id = sc.nextInt();
		System.out.println("Person Name");
		name = sc.next();
		System.out.println("Person Contact");
		contact = sc.next();
		System.out.println("Person Address");
		address = sc.next();
		System.out.println("ID Name");
		idname = sc.next();
		System.out.println("ID Number");
		idnumber = sc.nextInt();
		System.out.println("ID Validity");
		idvalidity = sc.nextInt();

		Q3Idproof p = new Q3Idproof();
		p.setId(id);
		p.setName(name);
		p.setContact(contact);
		p.setAddress(address);
		p.setIdname(idname);
		p.setIdnumber(idnumber);
		p.setIdvalidity(idvalidity);

			System.out.println("ID NO. : " + p.getId() + "\t Name : " + p.getName() + "\t Contact : " + p.getContact()
					+ "\t Address : " + p.getAddress());
			System.out.println("ID Name : " + p.getIdname() + "\t ID Number : " + p.getIdnumber() + "\t ID Validity : "
					+ p.getIdvalidity());
		
		
		sc.close();
	}

}
