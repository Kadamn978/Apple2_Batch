package AccessSpecifier1;

public class Class2 extends Class1 {
	void display() {
		System.out.println("Default Child Method");
	}

	public static void main(String[] args) {
		Class2 c2 = new Class2();
		System.out.println(c2.def);
//		System.out.println(c2.pri); // private
		System.out.println(c2.pro);
		System.out.println(c2.pub);

	}

}
