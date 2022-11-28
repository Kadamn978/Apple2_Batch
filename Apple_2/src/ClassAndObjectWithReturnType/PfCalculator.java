package ClassAndObjectWithReturnType;

public class PfCalculator {
void pfcal(float newsal) {
		
		if(newsal>0 && newsal<=10000) {
		float pf= (15/100f)*newsal;
		float tsal =newsal-pf;
		System.out.println("Salary of Employee = RS "+newsal);
		System.out.println("Pf of Employee deducted = Rs "+ String.format("%.2f", pf));
		System.out.println("Salary In Hand = Rs "+String.format("%.2f", tsal));
		}
		
		else if(newsal>10000 && newsal<=25000) {
			float pf= (20/100f)*newsal;
			float tsal =newsal-pf;
			System.out.println("Salary of Employee = RS "+newsal);
			System.out.println("Pf of Employee deducted = Rs "+ String.format("%.2f", pf));
			System.out.println("Salary In Hand = Rs "+String.format("%.2f", tsal));
			}
		else if(newsal>25000 && newsal<=75000) {
			float pf= (25/100f)*newsal;
			float tsal =newsal-pf;
			System.out.println("Salary of Employee = RS "+newsal);
			System.out.println("Pf of Employee deducted = Rs "+ String.format("%.2f", pf));
			System.out.println("Salary In Hand = Rs "+String.format("%.2f", tsal));
			}
		else if(newsal>75000 && newsal<=125000) {
			float pf= (30/100f)*newsal;
			float tsal =newsal-pf;
			System.out.println("Salary of Employee = RS "+newsal);
			System.out.println("Pf of Employee deducted = Rs "+ String.format("%.2f", pf));
			System.out.println("Salary In Hand = Rs "+String.format("%.2f", tsal));
			}
		else {
			float pf= (35/100f)*newsal;
			float tsal =newsal-pf;
			System.out.println("Salary of Employee = RS "+newsal);
			System.out.println("Pf of Employee deducted = Rs "+ String.format("%.2f", pf));
			System.out.println("Salary In Hand = Rs "+String.format("%.2f", tsal));
			}
	}

}
