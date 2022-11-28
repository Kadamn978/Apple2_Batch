package ClassAndObjects;

public class SalaryHike {

	void hike(int sal, char rating) {
		if (rating == 'A' || rating == 'a') {
			float hike = sal * (20 / 100f);
			float tsal = sal + hike;
			System.out.println("Salary of Employee = RS " + sal);
			System.out.println("Hike in Salary = Rs " + String.format("%.2f", hike));
			System.out.println("Salary In Hand = Rs " + String.format("%.2f", tsal));
		}
		else if (rating == 'B' || rating == 'b') {
			float hike = sal * (15 / 100f);
			float tsal = sal + hike;
			System.out.println("Salary of Employee = RS " + sal);
			System.out.println("Hike in Salary = Rs " + String.format("%.2f", hike));
			System.out.println("Salary In Hand = Rs " + String.format("%.2f", tsal));
		}
		else if (rating == 'C' || rating == 'c') {
			float hike = sal * (10 / 100f);
			float tsal = sal + hike;
			System.out.println("Salary of Employee = RS " + sal);
			System.out.println("Hike in Salary = Rs " + String.format("%.2f", hike));
			System.out.println("Salary In Hand = Rs " + String.format("%.2f", tsal));
		}
		else {
			System.out.println("No Hike for You Better Luck Next Time!");
			System.out.println("Salary of Employee = RS " + sal);
		}
	}

}
