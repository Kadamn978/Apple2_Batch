package MethodOverloading;

public class Example {

	void add(int a, int b) {
		System.out.println("Output = "+(a+b));
	}

	void add(int a, int b, int c) {
		System.out.println("Output = "+(a+b));
	}

	void add(float a, int b) {
		System.out.println("Output = "+(a+b));
	}

	void add(int a, float b) {
		System.out.println("Output = "+(a+b));
	}

	void add(String a, int b) {
		System.out.println("Output = "+(a+b));
	}

	void add(int a, String b) {
		System.out.println("Output = "+(a+b));
	}

	void add(float a, float b) {
		System.out.println("Output = "+(a+b));
	}

	void add(String a, String b) {
		System.out.println("Output = "+(a+b));
	}

	void add(float a, String b) {
		System.out.println("Output = "+(a+b));
	}

	public static void main(String[] args) {
		Example e = new Example();
		e.add(2, 5);
		e.add(0, 0,55);
		e.add(0.5f, 5);
		e.add(5, 0022f);
		e.add("Manoj", 0);
		e.add(0, "Raj");
		e.add(0.55f, "manoj");
		e.add(0.55f,0.55f);
		
		
	

	}

}
