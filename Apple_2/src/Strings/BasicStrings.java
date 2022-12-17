package Strings;

public class BasicStrings {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Programming";
		String s3="Java";
		
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s3));
//		
//		System.out.println("Core "+s1);
//		System.out.println(s1+s2);
//		System.out.println(s1.concat(s2));
//		System.out.println(s1.concat("Language"));
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareToIgnoreCase(s2));
//		
//		System.out.println(s1.charAt(0));
//		System.out.println(s2.contains("mm"));
//		System.out.println(s2.startsWith("Pr"));
//		System.out.println(s2.endsWith("ing"));
//		System.out.println(s2.indexOf("in"));
//		System.out.println(s2.lastIndexOf("g"));
//		
//		System.out.println(s2.replace('P', 'p'));
//		
//				   012345678901234567890123456789012345678901234
		String s4="Pneumonoultramicroscopicsilicovolcanoconiosis";
		
		System.out.println(s4.substring(7));
		System.out.println(s4.substring(7,15));	
		
		System.out.println(s4.toUpperCase());
		System.out.println(s4.toLowerCase());
		
	}

}
