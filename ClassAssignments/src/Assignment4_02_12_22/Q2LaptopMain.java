package Assignment4_02_12_22;

import java.util.Scanner;

public class Q2LaptopMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of Ports in Laptop");
		int no=sc.nextInt();
		System.out.println("Enter Processing Speed");
		float speed=sc.nextFloat();
		
		Q2Laptop l=new Q2Laptop();
		l.setNoOfUSBPort(no);
		l.setProcessorSpeed(speed);
		
		System.out.println("No of Ports in Laptop "+l.getNoOfUSBPort());
		System.out.println("Processor of Speed = "+l.getProcessorSpeed()+" GHz");

		sc.close();
	}

}
