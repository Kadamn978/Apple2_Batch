package ArrayCointainment;

import java.util.Arrays;

public class Person {
	int id;
	String name,address;
	PersonIdProof p[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public PersonIdProof[] getP() {
		return p;
	}
	public void setP(PersonIdProof[] p) {
		this.p = p;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "ID : "+id+"\t Name : "+"\t Address : "+address+"\nID Proof : "+Arrays.toString(p);
}
}
