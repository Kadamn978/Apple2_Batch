package Cointainment_Single;

import java.util.Scanner;

public class MyDateTimeMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Date-Month-Year");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		System.out.println("Enter Time Hour-Minutes-Seconds");
		int hr=sc.nextInt();
		int min=sc.nextInt();
		int sec=sc.nextInt();
		
		Mytime mt=new Mytime();
		
		mt.setDd(dd);
		mt.setMm(mm);
		mt.setYy(yy);
		mt.setMin(min);
		mt.setHr(hr);
		mt.setSec(sec);
		
		System.out.println("Date: "+mt.getDd()+"/"+mt.getMm()+"/"+mt.getYy());
		System.out.println("Time- "+mt.getHr()+":"+mt.getMin()+":"+mt.getSec());
		sc.close();
	}

}
