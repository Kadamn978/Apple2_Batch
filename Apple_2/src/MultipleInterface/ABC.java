package MultipleInterface;

public class ABC implements A, B {

	@Override
	public void add(int a, int b) {
		System.out.println("Addition = " + (a + b));
	}

	@Override
	public void sq(int a) {
		System.out.println("Square = " + (a * a));
	}

	@Override
	public void sqrt(int a) {
		System.out.println("Squareroot = " + Math.sqrt(a));

	}

	public static void main(String[] args) {
		ABC obj = new ABC();
		obj.add(15, 20);
		obj.sq(25);
		obj.sqrt(36);

	}

}
