package Abstraction;

public abstract class Electronics {
	 int price,weight;
	 String color;
		
	 void processor() {
		 System.out.println("Comes with Intel Core i7-3770 3.4 GHz Upto 3.9 GHz LGA 1155 Socket 4 Cores 8 ");
	 }
	 
	 void semiConductor() {
		 System.out.println("Silicon and Germanium diodes are used in TV applications as"
		 					+ " uhf mixers, harmonic generators and video detectors. ");
	 }
	 
	 abstract void powerRating();
	 abstract void electricityConsumption();
	 abstract void features();
	 
}
