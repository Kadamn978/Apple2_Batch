package Assignment3_26_11_22;

import java.util.Scanner;
//	Q1. WAP to have Department class created with id, name . Student class has roll, name and 
//		Department object should have id and name. Assign and print individual values in main method

public class Q1Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int roll,did;
		String name,dname;
		
		System.out.println("Enter Student Roll no");
		roll=sc.nextInt();
		System.out.println("Enter Student Name");
		name=sc.next();
		System.out.println("Enter Department ID");
		did=sc.nextInt();
		System.out.println("Enter Department Name");
		dname=sc.next();
		
		Q1Department dept=new Q1Department();
		dept.setDid(did);
		dept.setDname(dname);
		
		Q1Student stu=new Q1Student();
		stu.setRollno(roll);
		stu.setName(name);
		stu.setD(dept);
		
		System.out.println("\nStudent Information ");
		System.out.println("Name: "+stu.getName()+"\nRoll No.: "+stu.getRollno());
		
		System.out.println("\nDepartment Details ");
		System.out.println("Department ID : "+stu.getD().getDid()+"\nDepartment Name: "+stu.getD().getDname());
		
		sc.close();
	}

}
