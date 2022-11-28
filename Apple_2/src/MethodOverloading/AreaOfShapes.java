package MethodOverloading;

import java.util.Scanner;

public class AreaOfShapes {

	void area(int l, int b) {
		System.out.println("Area of Rectangle = " + (l * b)+" sq.units");
	}

	void area(float r) {
		System.out.println("Area of Cirlce = " + (3.14f * r * r)+" sq.units");

	}

	void area(float h, int b) {
		System.out.println("Area of Triangle = " + ((h * b) / 2f)+" sq.units");
	}

	void area(int s) {
		System.out.println("Area of Square = " + (s * s)+" sq.units");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Shape whos Area You Want to Find");
		System.out.println("Circle, Triangle,Rectangle,Square");
		String ch = sc.next().toLowerCase();

		AreaOfShapes a = new AreaOfShapes();

		switch (ch) {
		case "circle":
			System.out.println("Enter radius of Circle");
			float r = sc.nextFloat();
			a.area(r);
			break;
			
		case "triangle":
			System.out.println("Enter Base and Height of Triangle");
			float h = sc.nextInt();
			int b = sc.nextInt();
			a.area(h, b);
			break;
			
		case "rectangle":
			System.out.println("Enter Length and width of Rectangle");
			int l = sc.nextInt();
			int w = sc.nextInt();
			a.area(l, w);
			break;
			
		case "square":
			System.out.println("Enter Length of Square");
			int s = sc.nextInt();
			a.area(s);
			break;

		}
		sc.close();
	}

}
