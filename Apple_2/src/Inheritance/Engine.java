package Inheritance;

public class Engine  {
	int power,torque;
	String cname;

	public Engine(int power, int torque, String cname) {
		this.power=power;
		this.torque=torque;
		this.cname=cname;
	}
	@Override
	public String toString() {
		
		return "Engine Details:\nPower"+power+"\nTorque "+torque+"\nCompany Name "+cname;
	}

}
