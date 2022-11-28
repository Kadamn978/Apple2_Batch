package ClassAndObjectWithReturnType;

import java.util.Scanner;

public class AreaOFCircleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of Circle");
		float r = sc.nextFloat();

		AreaOFCircle ar = new AreaOFCircle();
		float rsq = ar.radius(r);
		ar.area(rsq);
		
		sc.close();
	}

}
