package Cointainment_Hierarchical;

public class Faculty extends Person {
	String sub;
	int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	void pfCalculator(int salary) {
		this.salary = salary;
		double pf = salary * (18 / 100f);
		System.out.println("PF= " + pf);
		System.out.println("Salary After Deducting PF = " + (salary - pf));
	}

}
