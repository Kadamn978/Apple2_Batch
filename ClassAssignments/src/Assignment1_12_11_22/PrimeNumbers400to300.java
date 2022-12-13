package Assignment1_12_11_22;

public class PrimeNumbers400to300 {

	public static void main(String[] args) {
		// Q.5- Find all prime number between 400 to 300;	
		
		System.out.println("Prime numbers from 400 to 300 are :");
		for (int i = 400; i >= 300; i--)
		 {
			int count = 0;
			for (int j = i; j >= 1; j--) 
			{
				if (i % j == 0)
				 {
					count++;
				}
			}
			if (count == 2) 
			{
				System.out.print(i + "  ");
			}
		}

	}

}
