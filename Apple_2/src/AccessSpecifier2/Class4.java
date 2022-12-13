package AccessSpecifier2;

import AccessSpecifier1.Class1;

public class Class4 extends Class1 {

	public static void main(String[] args) {
		Class4 c4 = new Class4();
//		System.out.println(c4.def); //default
//		System.out.println(c4.pri); //private
		System.out.println(c4.pro);
		System.out.println(c4.pub);

	}

}
