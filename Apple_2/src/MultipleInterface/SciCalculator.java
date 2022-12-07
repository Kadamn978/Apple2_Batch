package MultipleInterface;

public class SciCalculator implements Calculator{

	public void power(int a,int b) {
		System.out.println("Power = "+Math.pow(a, b));
	}
	
	public void squareroot(int a) {
		System.out.println("Squareroot = "+Math.sqrt(a));
	}
	
	public void square(int a) {
		System.out.println("Square = "+(a*a));
	}
	
	@Override
	public void addition(int a,int b) {
		System.out.println("Addition =" +(a+b));
	}

	@Override
	public void subtraction(int a,int b) {
		System.out.println("Subtraction =" +(a-b));
	}

	@Override
	public void multilpication(int a,int b) {
		System.out.println("Multiplication =" +(a*b));
	}

	@Override
	public void division(int a,int b) {
		System.out.println("Division =" +(a/b));
	}

}
