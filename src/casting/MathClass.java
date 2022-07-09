package casting;

public class MathClass {

	private MathClass() { // to prevent creating instance
	}

	public static double sqr(double a) {
		return (a * a);
	}

	public static double max(double a, double b) {
		return (a >= b) ? a : b;
	}

	public static double min(double a, double b) {
		return (a <= b) ? a : b;

	}

	public static double abs(double a) {

		if (a < 0) {
			return a * -1;
		} else {
			return a;
		}

	}
}
