package ArrayCointainment;

import java.util.Arrays;

public class Theatre {
	int id;
	String name;
	TheatreMovie m[];
	
	public Theatre(int id,String name,TheatreMovie m[]) {
		this.id=id;
		this.name=name;
		this.m=m;
	}
	
	public String toString() {
		return "Theatre ID : "+id+"\t Name : "+name+"\n Movies : \n"+Arrays.toString(m);
	}

}
