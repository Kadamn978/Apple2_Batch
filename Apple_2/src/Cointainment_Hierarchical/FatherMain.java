package Cointainment_Hierarchical;

public class FatherMain {

	public static void main(String[] args) {
		Son s=new Son();
		s.setAge(25);
		s.setName("Manoj");
		System.out.println("Full Name: "+s.getName()+" "+Son.fname+" "+Son.Surname);
		System.out.println("Age: "+s.getAge());
		System.out.print("Education : ");
		s.Education();
		System.out.print("Location : ");
		s.Location();
		
		System.out.println(" ");
		
		Daughter d=new Daughter();
		d.setName("Priya");
		d.setAge(22);
		System.out.println("Full Name: "+d.getName()+" "+Daughter.fname+" "+Daughter.Surname);
		System.out.println("Age: "+d.getAge());
		System.out.print("Education : ");
		d.Education();
		System.out.print("Location : ");
		d.Location();
		
	}

}
