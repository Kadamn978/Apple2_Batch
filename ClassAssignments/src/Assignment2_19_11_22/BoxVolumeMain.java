package Assignment2_19_11_22;

import java.util.Scanner;


//  Q. Create class Box and calculate the volume of box volume=length x width x height
//     (create separate method for volume).


public class BoxVolumeMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Length Of Box");
		float l = sc.nextFloat();
		System.out.println("Enter Width Of Box");
		float w = sc.nextFloat();
		System.out.println("Enter Height Of Box");
		float h = sc.nextFloat();
		
		BoxVolume v= new BoxVolume();
		
		float vol=v.volume(l, w, h);
		System.out.println("Volume = "+String.format("%.2f", vol));
		
		sc.close();
	}

}
