package ExceptionHandling;

import java.util.Arrays;

public class ExceptionArrayEx {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,7,0,80,90,100};
		try {
			 a[20]= 10;
		}
		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(a));
		
	}

}
