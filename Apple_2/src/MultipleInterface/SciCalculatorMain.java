package MultipleInterface;

import java.util.Scanner;

public class SciCalculatorMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First No");
		int a=sc.nextInt();
		System.out.println("Enter Second No");
		int b=sc.nextInt();
		
		SciCalculator s=new SciCalculator();
		s.power(a, b);
		s.square(a);
		s.squareroot(a);
		s.addition(a, b);
		s.subtraction(a, b);
		s.division(a, b);
		s.multilpication(a, b);
		
		
		sc.close();

	}

}
