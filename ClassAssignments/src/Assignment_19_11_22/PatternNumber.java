package Assignment_19_11_22;

public class PatternNumber {
	void num() {
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
				System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println("");
		}
	}

}
