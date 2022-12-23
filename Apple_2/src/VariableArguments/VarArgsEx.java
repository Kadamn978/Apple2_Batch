package VariableArguments;

public class VarArgsEx {
	void sum(int ... a)
	{
		int sum = 0;
		// for each loop
		for(int m:a) {
			sum=sum+m;
		}
		System.out.println("Sum = "+sum);
	}
	
	void pro(int ... a)
	{
		int pro = 1;
		// Normal for loop
		for(int i=0;i<a.length;i++) {
			pro=pro*a[i];
		}
		System.out.println("Product  = "+pro);
	}
	
	
	
	public static void main(String[] args) {
		VarArgsEx v = new VarArgsEx();
		v.sum(1,2,3,4,5,6,7,8,9,10);
		v.pro(1,2,3,4,5,6,7,8,9,10);
		
	}

}
