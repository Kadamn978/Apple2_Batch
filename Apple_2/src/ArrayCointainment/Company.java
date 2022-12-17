package ArrayCointainment;

import java.util.Arrays;

public class Company {
	int cid;
	String cname;
	Department dept[];

	public Company(int cid, String cname, Department dept[]) {
		this.cid = cid;
		this.cname = cname;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Company ID : " + cid + "\t Name : " + cname + "\n Department \n1" + Arrays.toString(dept);
	}

}
