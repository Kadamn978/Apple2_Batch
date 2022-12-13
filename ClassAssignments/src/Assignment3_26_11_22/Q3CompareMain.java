package Assignment3_26_11_22;

import java.util.Scanner;

public class Q3CompareMain {
//	Q3. Design a class to overload a function compare( ) as follows:
//		(a) void compare (int, int) – to compare two integer values and print the greater of the two integers.
//		(b) void compare (char,char) – to compare the numeric value of two characters and 
//			print the character with higher numeric value

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter First No");
		int a= sc.nextInt();
		System.out.println("Enter Second No");
		int b=sc.nextInt();
		
		System.out.println("Enter First Alphabet");
		char c= sc.next().charAt(0);
		System.out.println("Enter Second Alphabet");
		char d=sc.next().charAt(0);
		
		Q3Compare cm=new Q3Compare();
		cm.Compare(a, b);
		System.out.println();
		cm.Compare(c, d);
		System.out.println();
		cm.Compare('a', 'z');
		System.out.println();
		cm.Compare(2,25);
		
		
		
		
		sc.close();

	}

}
