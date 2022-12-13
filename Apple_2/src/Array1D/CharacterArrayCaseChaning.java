package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterArrayCaseChaning {
	void caseChanging(char a[]) {
		System.out.println("Original Array : \n" + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'a' && a[i] <= 'z') {
				a[i] = ((char) (a[i] - 32));
			} 
			else if (a[i] >= 'A' && a[i] <= 'Z') {
				a[i] = ((char) (a[i] + 32));
			}
		}
		System.out.println("New Array : \n" + Arrays.toString(a));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size ");
		int size = sc.nextInt();

		char arr[] = new char[size];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}

		CharacterArrayCaseChaning c = new CharacterArrayCaseChaning();
		c.caseChanging(arr);

		sc.close();
	}

}
