package Assignment_26_11_22;

public class Q4Series {

	double series(double n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = (sum + (1.00/i));
		}
		return sum;
	}

	double series(double a, double n) {
		double sum = 0;
		double nm = 1.00, dm = 2.00;
		for (int i = 1; i <= n; i++) {
			sum = (sum + (nm / (Math.pow(a, dm))));
			nm = nm + 3;
			dm = dm + 3;
		}
		return sum;
	}

}
