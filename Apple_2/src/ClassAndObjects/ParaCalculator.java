package ClassAndObjects;

public class ParaCalculator {
	void add(int a,int b) {
		
		System.out.println("Addition = " + (a+b));
	}

	void subtract(int a,int b) {
		System.out.println("Subtraction = " + (a-b));
	}

	void multiply(int a,int b) {
		System.out.println("Multiplication = " + (a*b));
	}

	void divide(float a, float b) {
		System.out.println("Division = " +String.format("%.2f", (a/b)) );

	}

	void square(int a) {
		System.out.println("Square = " + (a*a));
	}

	void squareRoot(int a) {
		System.out.println("SquareRoot = " + (a/a));
	}


}
