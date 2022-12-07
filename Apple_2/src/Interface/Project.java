package Interface;

public interface Project {
	
	String name="Infosys";  // by default its --> public static final             

	void requriment();   // by default its -->abstract public 
	void planning();
	void design();
	void development();
	void testing();
	void deployment();
	void maintainance();
	
	
	private void feedback() {
		
	}
}
