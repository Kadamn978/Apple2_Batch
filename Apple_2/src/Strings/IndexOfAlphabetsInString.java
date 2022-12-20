package Strings;

import java.util.Arrays;

public class IndexOfAlphabetsInString {

	public static void main(String[] args) {
		//			01234567890123456789012345678901234567890123
		String s = "The quick brown fox jumps over the lazy dog.";
		char str[] = s.toCharArray();
		System.out.println(Arrays.toString(str));

		for (int j = 'A'; j <= 'z'; j++) {
			for (int i = 0; i < str.length; i++) {
			if (j==str[i]) {
				System.out.println((char)j + " is Present At Index " + i);
			}
			}
		}

	}
}
