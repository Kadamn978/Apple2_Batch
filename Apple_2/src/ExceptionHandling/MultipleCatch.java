package ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int arr[] = { 10, 20, 30, 0, 100 };
		String s = "India";
		String str = null;
		try {
//			System.out.println("Division = " + (a / b));
//			System.out.println(arr[10]);
//			System.out.println(s.charAt(8));
			System.out.println(str.charAt(1));
		} 
		catch (ArithmeticException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
//		catch (ArithmeticException e) {
//			System.out.println(e);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		} 
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println(e);
//		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
