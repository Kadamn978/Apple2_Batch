package ClassAndObjectWithReturnType;

public class Student {

	float Percentage(int s1, int s2, int s3, int s4, int s5) {
		float perc = ((s1 + s2 + s3 + s4 + s5) /500f)*100;
		return perc;
	}

	/*
	 * 75% – Distinction 60-75% – 1st Division 50-60% – 2nd Division 40-50% – 3rd
	 * Division
	 */
	void Grade(float perc) {
		if (perc >= 75 && perc <=100) {
			System.out.println("You have got "+String.format("%.2f", perc)+" % Passed with Distinction");
		}

		else if (perc >= 60 && perc < 75) {
			System.out.println("You have got "+String.format("%.2f", perc)+" % Passed with First Division");
		}
		else if (perc >= 50 && perc < 60) {
			System.out.println("You have got "+String.format("%.2f", perc)+" % Passed with Second Division");
		}
		else if (perc >= 40 && perc < 50) {
			System.out.println("You have got "+String.format("%.2f", perc)+" % Passed with Third Division");
		}
		else if (perc > 0 && perc < 40) {
			System.out.println("You have got "+String.format("%.2f", perc)+" % Failed ");
		}
		else {
			System.out.println("You have Entered invalid Marks Can't calculate Percentage ");
		}

	}

}
