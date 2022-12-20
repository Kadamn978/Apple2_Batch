package Strings;

public class PrintingStringVertically {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Bye";
		String s3 = "WellDone";
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		char[] a3 = s3.toCharArray();

		int len = 0;
		
		System.out.println(a1.length + " " + a2.length + " " + a3.length);
			
		if (a1.length < a2.length) {
				len = a2.length;
			} 
		else if (a1.length < a3.length) {
				len = a3.length;
			} 
		else {
				len = a2.length;
			}
		
		System.out.println("String 1: " + s1 + "\nString 2: " + s2 + "\nString 3: " + s3);

		for (int i = 0; i < len; i++) {
			if (i < a2.length) {
				System.out.print(a1[i]);
				System.out.print(a2[i]);
				System.out.print(a3[i]);
				System.out.println(" ");
			}
		}
		for (int i = a2.length; i < len; i++) {
			if (i < a1.length) {
				System.out.print(a1[i]);
				System.out.print(a3[i]);
				System.out.println(" ");
			}
		}
		for (int i = a1.length; i < len; i++) {
			if (i < a3.length) {
				System.out.print(a3[i]);
				System.out.println(" ");
			}
		}

	}

}
