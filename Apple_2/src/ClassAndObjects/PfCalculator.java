package ClassAndObjects;

public class PfCalculator {
	
	void pfcal(int sal) {
		
		if(sal>0 && sal<=10000) {
		float pf= (15/100f)*sal;
		float tsal =sal-pf;
		System.out.println("Salary of Employee = RS "+sal);
		System.out.println("Pf of Employee deducted = Rs "+ String.format("%.2f", pf));
		System.out.println("Salary In Hand = Rs "+String.format("%.2f", tsal));
		}
		
		else if(sal>10000 && sal<=25000) {
			float pf= (20/100f)*sal;
			float tsal =sal-pf;
			System.out.println("Salary of Employee = RS "+sal);
			System.out.println("Pf of Employee deducted = Rs "+ String.format("%.2f", pf));
			System.out.println("Salary In Hand = Rs "+String.format("%.2f", tsal));
			}
		else if(sal>25000 && sal<=75000) {
			float pf= (25/100f)*sal;
			float tsal =sal-pf;
			System.out.println("Salary of Employee = RS "+sal);
			System.out.println("Pf of Employee deducted = Rs "+ String.format("%.2f", pf));
			System.out.println("Salary In Hand = Rs "+String.format("%.2f", tsal));
			}
		else if(sal>75000 && sal<=125000) {
			float pf= (30/100f)*sal;
			float tsal =sal-pf;
			System.out.println("Salary of Employee = RS "+sal);
			System.out.println("Pf of Employee deducted = Rs "+ String.format("%.2f", pf));
			System.out.println("Salary In Hand = Rs "+String.format("%.2f", tsal));
			}
		else {
			float pf= (35/100f)*sal;
			float tsal =sal-pf;
			System.out.println("Salary of Employee = RS "+sal);
			System.out.println("Pf of Employee deducted = Rs "+ String.format("%.2f", pf));
			System.out.println("Salary In Hand = Rs "+String.format("%.2f", tsal));
			}
	}

}
