package Strings;

public class PrintOccuranceOfWord {

	public static void main(String[] args) {
		String s = "abbcaabcbbcaabbcaabcbbcaabbcaabcbbcaabbcaabcbbcaabbcaabcbbcaabbcaabcbbcaabbcaabcbbca";

		char ch[] = s.toCharArray();

		// Printing bca
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'b' && ch[i + 1] == 'c' && ch[i + 2] == 'a') {
				System.out.print(ch[i] + "" + ch[i + 1] + "" + ch[i + 2] + " ");
			}
		}
		System.out.println("");

		//removing bca
		String s1="";
		for (int i = 0; i < ch.length; i++) {
			if(i==ch.length-2||i==ch.length-2) {
				s1=s1+ch[i];
			}
			if (ch[i] == 'b' && ch[i + 1] == 'c' && ch[i + 2] == 'a') {
				i=i+2;
			}
			else {
				s1=s1+ch[i];
			}
		}
		System.out.println(s1);
		

	}

}
