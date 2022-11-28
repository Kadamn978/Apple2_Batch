package ClassAndObjectWithReturnType;

public class SimpleInterest {
	
	float si(int p,float n,float r) {
		float si= (p*r*n)/100f;
		System.out.println("Principle Amount = "+p);
		System.out.println("Rate of Interest = "+r);
		System.out.println("Duration Year = "+n);
		return si;
	}

}
