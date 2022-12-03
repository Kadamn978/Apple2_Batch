package Assignmrnt_02_12_11;

import java.util.Scanner;

public class Q1ShapeMain {

	public static void main(String[] args) {
		int length, width, side, radius, height, base;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Shape to find Area");
		System.out.println("1. Rectangle, 2. Square, 3. Circle,  4. Triangle");
		int ch = sc.nextInt();

		Q1ShapeArea s = new Q1ShapeArea();
		switch (ch) {
		case 1:
			System.out.println("Enter Length of Rectangle");
			length = sc.nextInt();
			s.setLenght(length);
			System.out.println("Enter Width of Rectangle");
			width = sc.nextInt();
			s.setWidth(width);
			s.rectangle(length, width);
			break;
		case 2:
			System.out.println("Enter Side Of Square");
			side = sc.nextInt();
			s.setSide(side);
			s.square(side);
			break;
		case 3:
			System.out.println("Enter Side Of Circle");
			radius = sc.nextInt();
			s.setRadius(radius);
			s.circle(radius);
			break;
		case 4:
			System.out.println("Enter Base of Triangle");
			base = sc.nextInt();
			s.setBase(base);
			System.out.println("Enter Height of Triangle");
			height = sc.nextInt();
			s.setHeight(height);

			s.triangle(base, height);
			break;
		default:
			System.out.println("Invalid Selection");

		}
		sc.close();
	}

}
