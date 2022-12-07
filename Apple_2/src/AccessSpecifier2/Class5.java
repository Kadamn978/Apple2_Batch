package AccessSpecifier2;

import AccessSpecifier1.Class1;

public class Class5 {

	public static void main(String[] args) {
		Class5 c5 = new Class5();
		System.out.println(c5.def); // default
		System.out.println(c5.pri); // private
		System.out.println(c5.pro); // Protected
		System.out.println(c5.pub);
	}

}
