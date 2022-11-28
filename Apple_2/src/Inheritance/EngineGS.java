package Inheritance;

public class EngineGS {
	private int power,torque;
	private String cname;
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getTorque() {
		return torque;
	}
	public void setTorque(int torque) {
		this.torque = torque;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
//public String toString() {
//		
//		return "Engine Details:\nPower: "+power+"\nTorque: "+torque+"\nCompany Name: "+cname;
//	}

}
