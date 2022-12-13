package Assignment5_10_12_22;

public class Q1MachineMain {

	public static void main(String[] args) {
		Q1Juicer j= new Q1Juicer();
		j.crush();
		j.rotate();
		j.filter();
		
		Q1Machine m = new Q1Juicer();
		m.crush();
		m.rotate();
	
	}

}
