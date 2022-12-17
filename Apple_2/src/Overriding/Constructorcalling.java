package Overriding;

class A {
	A() {
		System.out.println("Inside Construcuor A");
	}
}

class B extends A {
	B() {
		System.out.println("Inside Construcuor B");
	}
}

class C extends B {
	C() {
		System.out.println("Inside Construcuor C");
	}
}

public class Constructorcalling {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c);
	}

}
