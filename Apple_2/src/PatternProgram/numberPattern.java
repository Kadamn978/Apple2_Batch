package PatternProgram;

import java.util.Scanner;

public class numberPattern {

	public static void main(String[] args) {
		
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter No of Rows");
		 n=s.nextInt();
		 System.out.println();
		 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i  + " ");
			}
			System.out.println();
		}
		
		s.close();
	}

}
