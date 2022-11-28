package ClassAndObjects;

import java.util.Scanner;

public class Pattern {

	void starPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter No of Rows you want to Print");
		int r = sc.nextInt();
		for (int i = 1; i <= r; i++) {
			for (int j = 1;  j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
	void numberPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter No of Rows you want to Print");
		int r = sc.nextInt();
		for (int i = 1; i <= r; i++) {
			for (int j = 1;  j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	void starDownwardPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter No of Rows you want to Print");
		int r = sc.nextInt();
		for (int i = r; i >= 1; i--) {
			for (int j = 1;  j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
	
	void numberDownwardPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter No of Rows you want to Print");
		int r = sc.nextInt();
		for (int i = r; i >= 1; i--) {
			for (int j = 1;  j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which pattern you want to Print");
		System.out.println(" 1.starPattern,\n 2.numberPattern,\n 3.starDownwardPattern,\n 4.numberDownwardPattern\n");
		int ch = sc.nextInt();
		Pattern p1= new Pattern();
		
		switch(ch){
		case 1:p1.starPattern();
				break;
		case 2:p1.numberPattern();
				break;
		case 3:p1.starDownwardPattern();
				break;
		case 4:p1.numberDownwardPattern();
				break;
		default : System.out.println("Invalid Selection");
		}
		
		sc.close();

	}

}
