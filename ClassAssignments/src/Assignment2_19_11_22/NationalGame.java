package Assignment2_19_11_22;


public class NationalGame {
	
//	India is Hockey, China is Table Tennis, Bangladesh is Kabaddi, Italy is Football,
//	United States is baseball.
	
	void country(String cname) {
		
		switch(cname) {
		case "india":System.out.println("National Game Of India is Hockey");
			break;
			
		case "china":System.out.println("National Game Of China is Table Tennis");
			break;
			
		case "bangladesh":System.out.println("National Game Of Bangladesh is Kabaddi");
			break;
			
		case "italy":System.out.println("National Game Of Italy is Football");
			break;
			
		case "usa":System.out.println("National Game Of United States is baseball");
			break;
			
		default:System.out.println("Invalid Country Name");
			
		
		}
		
	}
}
