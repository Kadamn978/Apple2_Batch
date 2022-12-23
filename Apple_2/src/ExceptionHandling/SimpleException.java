package ExceptionHandling;

public class SimpleException {

	void add(int a, int b) {
		System.out.println("Addition = "+(a+b));
	}
	void sub(int a, int b) {
		System.out.println("Subtraction = "+(a-b));
	}
	void mul(int a, int b) {
		System.out.println("Multiplication = "+(a*b));
	}
	void div(int a, int b) { // Called Method
		try {
		System.out.println("Division = "+(a/b));
		}
		catch (ArithmeticException e) {
			//System.out.println(e); // only prints Exception
			e.printStackTrace();// prints detailed exception details
		}
	}
	
	public static void main(String[] args) {  // Calling method
		int a=100,b=0;
		
		SimpleException s= new SimpleException();
//		try {
		s.add(a, b);
		s.div(a, b);
		s.sub(a, b);
		s.mul(a, b);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}


	}

}
