package Assignmrnt_02_12_11;

//	Q.  Create Class Laptop which has variables noOfUSBPort, processorSpeed of type int. 
//		Create getter, setter methods for the variables. In main method,
//		create Laptop object 
//		set values of variables noOfUSBPort, processorSpeed using setter methods. 
//		print variables noOfUSBPort, processorSpeed using getter methods.

public class Q2Laptop {
	int noOfUSBPort;
	float processorSpeed;

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public float getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(float processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

}
