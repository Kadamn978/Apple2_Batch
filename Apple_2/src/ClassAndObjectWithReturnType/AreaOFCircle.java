package ClassAndObjectWithReturnType;

public class AreaOFCircle {
	float radius(float r) {
		float sq = r * r;
		return sq;
	}

	void area(float sq) {
		float area = 3.14f * sq;
		System.out.println("Area of Circle = " + String.format("%.2f", area));
	}
}
