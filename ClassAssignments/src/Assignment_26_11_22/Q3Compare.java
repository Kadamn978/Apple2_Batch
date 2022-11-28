package Assignment_26_11_22;

public class Q3Compare {
	int a, b;
	char c, d;

	public void Compare(int a, int b) {
		this.a=a;
		this.b=b;
		if(a>b) {
			System.out.println(a+" is Greater than "+b);
		}
		else {
			System.out.println(b+" is Greater than "+a);
		}
	}

	public void Compare(char c,char d) {
		this.c=c;
		this.d=d;
		if(c>d) {
			System.out.println(c+" is Greater than "+d);
		}
		else {
			System.out.println(d+" is Greater than "+c);
		}

	}

}
