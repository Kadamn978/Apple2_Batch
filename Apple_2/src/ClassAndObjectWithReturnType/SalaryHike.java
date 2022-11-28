package ClassAndObjectWithReturnType;

public class SalaryHike {
	float hike ,tsal;
	float shike(float sal, char rating) {
		if (rating == 'A' || rating == 'a') {
			 hike = sal * (20 / 100f);
			 tsal = sal + hike;
			System.out.println("Salary of Employee = RS " + sal);
			System.out.println("Hike in Salary = Rs " + String.format("%.2f", hike));
			System.out.println("New Salary = Rs " + String.format("%.2f", tsal));
		}
		else if (rating == 'B' || rating == 'b') {
			 hike = sal * (15 / 100f);
			 tsal = sal + hike;
			System.out.println("Salary of Employee = RS " + sal);
			System.out.println("Hike in Salary = Rs " + String.format("%.2f", hike));
			System.out.println("New Salary = Rs " + String.format("%.2f", tsal));
		}
		else if (rating == 'C' || rating == 'c') {
			 hike = sal * (10 / 100f);
			 tsal = sal + hike;
			System.out.println("Salary of Employee = RS " + sal);
			System.out.println("Hike in Salary = Rs " + String.format("%.2f", hike));
			System.out.println("New Salary = Rs " + String.format("%.2f", tsal));
		}
		else {
			System.out.println("No Hike for You Better Luck Next Time!");
			System.out.println("New Salary = RS " + sal);
		}
		
		return tsal;
	}
	float bonus (float salary,char rating) {
		float sbonus=0;
			if (rating == 'A' || rating == 'a') {
				sbonus = salary * (20 / 100f);
				 tsal = salary + hike;
				System.out.println("Salary of Employee = RS " + salary);
				System.out.println("Hike in Salary = Rs " + String.format("%.2f", sbonus));
				System.out.println("New Salary = Rs " + String.format("%.2f", tsal));
			}
			else if (rating == 'B' || rating == 'b') {
				sbonus = salary * (15 / 100f);
				 tsal = salary + hike;
				System.out.println("Salary of Employee = RS " + salary);
				System.out.println("Hike in Salary = Rs " + String.format("%.2f", sbonus));
				System.out.println("New Salary = Rs " + String.format("%.2f", tsal));
			}
			else if (rating == 'C' || rating == 'c') {
				sbonus = salary * (10 / 100f);
				 tsal = salary + hike;
				System.out.println("Salary of Employee = RS " + salary);
				System.out.println("Hike in Salary = Rs " + String.format("%.2f", sbonus));
				System.out.println("New Salary = Rs " + String.format("%.2f", tsal));
			}
			else {
				System.out.println("No Hike for You Better Luck Next Time!");
				System.out.println("New Salary = RS " + salary);
			}
			
		return sbonus;
	}

}
