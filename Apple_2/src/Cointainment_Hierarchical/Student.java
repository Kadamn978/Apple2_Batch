package Cointainment_Hierarchical;

public class Student extends Person {
	double percent;
	String college;

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	void Grade(double percent) {
		this.percent = percent;

		if (percent < 100 && percent > 75) {
			System.out.println("Congrats!  You got Distinction");
		} else if (percent > 60) {
			System.out.println("Congrats!  You got 1st Division");
		} else if (percent > 50) {
			System.out.println("Congrats!  You got 2st Division");
		} else if (percent > 40) {
			System.out.println("Congrats!  You got 1st Division");
		} else if (percent > 0 && percent <= 40) {
			System.out.println("You are Fail!... ");
		} else {
			System.out.println("Invalid Percentage");
		}
	}

}
