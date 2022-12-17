package Strings;

public class CharacterOccurance {

	public static void main(String[] args) {
		
		String s1="Java Programming";
		char ch='a';
		int count=0;
		//Using Method
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("character '"+ch+"' has occured "+count+" times");
		
		//Without using method
		count=0;
		char s[]=s1.toCharArray();
		for (int i = 0; i < s.length; i++) {
			if(s[i]==ch) {// ch='a';
				count++;
				//Replace 'a' with 'A';
				// s[i]='A';
			}
		}
		System.out.println("character '"+ch+"' has occured "+count+" times");

	}

}
