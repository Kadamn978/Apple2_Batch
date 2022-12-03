package DynamicDispach;

public class FruitMain {

	public static void main(String[] args) {
		Fruit f= new Fruit();//normal Calling
		f.taste();//same class method is called
		
		Fruit f1= new Apple(); //Upcasting 
		f1.taste();//child class method is called
		
		Fruit f2= new Orange(); //Upcasting 
		f2.taste();//child class method is called

		// Apple a=new Fruit();   //Downcasting is not allowed 
		
	}

}
