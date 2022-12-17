package Assignment6_17_12_22;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2TotalNoOFCharNumSymbol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter String TO Find Alphabets, Digits or Special Character");
//		String s = sc.next();

//		String s = "I have 2 cats and 1 dog.";
		String s="Hello, World! 123";

		char ch[] = s.toCharArray();
		int small = 0;
		int capital = 0;
		int digit = 0;
		int specailChar = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				capital++;
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				small++;
			} else if (ch[i] >= '0' && ch[i] <= '9') {
				digit++;
			} else {
				specailChar++;
			}
		}
		System.out.println("Captial Letters = " + capital);
		System.out.println("Small Letters = " + small);
		System.out.println("Digits  = " + digit);
		System.out.println("Specaial Symbols = " + specailChar);

		sc.close();
//------------------------------------------------------------------------------------------------------//		
//----------------------------------Internet Program----------------------------------------------------//		

		    String input = "Hello, World! 123";

		    int alphabetCount = 0;
		    int digitCount = 0;
		    int specialCount = 0;

		    // Use regular expressions to count the number of alphabets, digits, and special characters
		    Pattern alphabetPattern = Pattern.compile("[A-Za-z]");
		    Matcher alphabetMatcher = alphabetPattern.matcher(input);
		    while (alphabetMatcher.find()) {
		      alphabetCount++;
		    }

		    Pattern digitPattern = Pattern.compile("[0-9]");
		    Matcher digitMatcher = digitPattern.matcher(input);
		    while (digitMatcher.find()) {
		      digitCount++;
		    }

		    Pattern specialPattern = Pattern.compile("[^A-Za-z0-9]");
		    Matcher specialMatcher = specialPattern.matcher(input);
		    while (specialMatcher.find()) {
		      specialCount++;
		    }

		    // Print the results
		    System.out.println("Alphabet count: " + alphabetCount);
		    System.out.println("Digit count: " + digitCount);
		    System.out.println("Special character count: " + specialCount);
		  }
		}
