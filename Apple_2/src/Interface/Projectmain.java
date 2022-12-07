package Interface;

public class Projectmain {

	public static void main(String[] args) {
		BankProject b = new BankProject();
		b.requriment();
		b.planning();
		b.design();
		b.development();
		b.testing();
		b.deployment();
		b.maintainance();
		System.out.println("");

		VaccineProject v = new VaccineProject();
		v.requriment();
		v.planning();
		v.design();
		v.development();
		v.testing();
		v.deployment();
		v.maintainance();

	}

}
