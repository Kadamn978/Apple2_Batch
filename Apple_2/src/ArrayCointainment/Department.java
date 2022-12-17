package ArrayCointainment;

public class Department {
	int did, empno;
	String dname;

	public Department(int did, String dname, int empno) {
		this.did = did;
		this.dname = dname;
		this.empno = empno;
	}

	@Override
	public String toString() {
		return "ID : " + did + "\t Name : " + dname + "\t No. Of Employees : " + empno + " \n";
	}
}
