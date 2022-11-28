package Encapsulation;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		int accno,balance;
		String name,contact,email;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Account no.");
		 accno = sc.nextInt();
		System.out.println("Enter Customer  Name");
		 name = sc.next();
		System.out.println("Enter Customer Contact no.");
		 contact = sc.next();
		System.out.println("Enter Customer  Email");
		 email = sc.next();
		System.out.println("Enter Customer  Balance");
		 balance = sc.nextInt();

		Customer c=new Customer();
		c.setAccno(accno);
		c.setName(name);
		c.setContact(contact);
		c.setEmail(email);
		c.setBalance(balance);
		System.out.println("  ");

		System.out.println("Enter Customer Account no.");
		 accno = sc.nextInt();
		System.out.println("Enter Customer  Name");
		 name = sc.next();
		System.out.println("Enter Customer Contact no.");
		 contact = sc.next();
		System.out.println("Enter Customer  Email");
		 email = sc.next();
		System.out.println("Enter Customer  Balance");
		 balance = sc.nextInt();

		 Customer c1=new Customer();
		c1.setAccno(accno);
		c1.setName(name);
		c1.setContact(contact);
		c1.setEmail(email);
		c1.setBalance(balance);
		
		System.out.println("\nAccount no \t Name \t Contact \t Email \t Balance");
		System.out.println(c.getAccno()+" \t "+c.getName()+" \t "+c.getContact()+" \t "+c.getEmail()+" \t "+c.getBalance());
		System.out.println(c1.getAccno()+" \t "+c1.getName()+" \t "+c1.getContact()+" \t "+c1.getEmail()+" \t "+c1.getBalance());

		System.out.println("Update Contact for Customer "+c.getName());
		contact=sc.next();
		c.setContact(contact);
		System.out.println("Sucessfully Updated details for customer "+c1.getName()+" Contact no. "+c.getContact());
		System.out.println("\nUpdate Email for Customer "+c1.getName());
		email=sc.next();
		c1.setEmail(email);
		System.out.println(" Sucessfully Updated details for customer "+c1.getName()+" Email "+c1.getEmail());
		
		sc.close();
	}

}
