package ArrayCointainment;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {

		int id, validity;
		String name, idname, address;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No of Person Data");
		int size = sc.nextInt();

		Person person[] = new Person[size];

		for (int i = 0; i < person.length; i++) {

			System.out.println("Enter Person ID Name Address : ");
			id = sc.nextInt();
			name = sc.next();
			address = sc.next();

			System.out.println("Enter No Of ID Proof");
			int isize = sc.nextInt();

			PersonIdProof idproof[] = new PersonIdProof[isize];
			for (int j = 0; j < idproof.length; j++) {
				System.out.println("Enter ID Name Validity ");
				idname = sc.next();
				validity = sc.nextInt();

				PersonIdProof idp = new PersonIdProof();
				idp.setIdname(idname);
				idp.setValidity(validity);
				idproof[j] = idp;
			}

			Person per = new Person();
			per.setId(id);
			per.setName(name);
			per.setAddress(address);
			per.setP(idproof);
			person[i]=per;

		}
		
		for (Person p:person) {
			for(PersonIdProof i:p.p) {
				if(i.getIdname().equalsIgnoreCase("PanCard")) {
					System.out.println("ID : "+p.getId()+"\t Name : "+p.getName()+"\t Address : "+p.getAddress());
					System.out.println("Name : " + i.getIdname() + "\t Validity : " + i.getValidity());
				}
			}
		}

		sc.close();
	}
}
