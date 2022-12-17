package Assignment6_17_12_22;

import java.util.Arrays;

public class Q1SplitString {

	public static void main(String[] args) {
		String s = "HELLO$WORLD";

		String[] words = s.split("[^A-Za-z0-9]");
		System.out.println(Arrays.toString(words));

//		char[] s1=s.toCharArray();
//		for (int i = 0; i < s1.length; i++) {
//			if(s1[i]>='!'&& s1[i]<='/' && s1[i]>='!'&& s1[i]<='/') {
//				s1[i]=' ';
//			}
//		}
//		String s2 = new String(s1);
//		String s3[]=s2.split(" ");
//		System.out.println(Arrays.toString(s3));
//		
//		System.out.println(s.substring(0,5));
//		System.out.println(s.substring(6,s.length()));

	}

}
