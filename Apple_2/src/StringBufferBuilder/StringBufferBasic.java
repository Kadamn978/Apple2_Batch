package StringBufferBuilder;

//import java.util.Scanner;

public class StringBufferBasic {

	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer("Core Java Language");
		System.out.println("Length = " + sbf.length());
		System.out.println("Capacity = " + sbf.capacity());

//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter String ");
//		String s2= sc.nextLine();
		// System.out.println("Core Java Language");
//		sbf.append(s2);
//		System.out.println("Length = "+sbf.length());
//		System.out.println("Capacity = "+sbf.capacity());

		sbf.append(" Advance Java Programming Language");
		System.out.println(sbf);
		System.out.println("Length = " + sbf.length());
		System.out.println("Capacity = " + sbf.capacity());

		System.out.println("charAt() = " + sbf.charAt(15));
		System.out.println("lastIndexOf() = " + sbf.lastIndexOf("Java"));
		System.out.println("indexOf() = " + sbf.indexOf("Java"));
		System.out.println("chars() = " + sbf.chars());
		System.out.println("getClass() = " + sbf.getClass());
		System.out.println("insert() = " + sbf.insert(5, "Universal "));
		System.out.println("isEmpty() = " + sbf.isEmpty());
		sbf.ensureCapacity(100);
		System.out.println("ensureCapacity() = " + sbf.capacity());
		sbf.setLength(60);
		System.out.println("setLength() = " + sbf);
		sbf.trimToSize();
		System.out.println("trimToSize() = " + sbf.capacity() + " Length = " + sbf.length());

		System.out.println("subSequence() = " + sbf.subSequence(2, 5));
		System.out.println("delete() = " + sbf.delete(15, 20));
		System.out.println("replace() = " + sbf.replace(4, 5, " C# "));
		System.out.println("reverse() = " + sbf.reverse());

	}

}
