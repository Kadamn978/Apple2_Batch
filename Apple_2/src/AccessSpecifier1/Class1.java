package AccessSpecifier1;

public class Class1 {
	int def = 10;
	private int pri = 20;
	protected int pro = 30;
	public int pub = 40;

//	private void display() {
//		System.out.println("Private Parent Method");
//	}
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		System.out.println(c1.def);
		System.out.println(c1.pri);
		System.out.println(c1.pro);
		System.out.println(c1.pub);

	}

}
