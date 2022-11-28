package MethodOverloading;

import java.util.Scanner;

public class Typecast {

//	void convert(int a) {
//		System.out.println("Value After Interger Typecast= " + (int) a);
//	}

	void convert(float a) {
		System.out.println("Value After Interger Typecast= " + (int) a);
	}

	void convert(double a) {
		System.out.println("Value After Interger Typecast= " + (int) a);
	}

	void convert(long a) {
		System.out.println("Value After Interger Typecast= " + (int) a);
	}
	void convert(char a) {
		System.out.println("Value After Interger Typecast= " + (int) a);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Typecast in integer");
		double a = sc.nextDouble();

		Typecast t = new Typecast();
		t.convert(a);
		t.convert(33.4f);
		t.convert(220);
		t.convert('a');
		sc.close();
	}

}
