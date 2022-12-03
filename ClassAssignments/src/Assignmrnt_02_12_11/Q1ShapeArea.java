package Assignmrnt_02_12_11;

public class Q1ShapeArea extends Q1Shape {
	float area;

	void rectangle(int length, int width) {
		area = length * width;
		System.out.println("Area of Rectangle = " + area+" sq.units");
	}

	void square(int side) {
		area = side * side;
		System.out.println("Area of Square = " + area+" sq.units");
	}

	void circle(float radius) {
		area = 3.14f * radius * radius;
		System.out.println("Area of Circle = " + area+" sq.units");
	}

	void triangle(int base, int height) {
		area = 0.5f * base * height;
		System.out.println("Area of Triangle = " + area+" sq.units");
	}

}
