package lt.lhu.unit04.main;

public class Task02 {

	public static void main(String[] args) {
		double a = 12.4;
		double b = -13.2;
		double c = 90.0;
		double sum = 0;
		double max = 0;
		double min = 0;
		min = addition(a, b, c);
		max = addition1(a, b, c);
		sum = max + min;
		System.out.println("sum = " + sum);
	}

	public static double addition(double x, double y, double z) {
		double min = Math.min(x, Math.min(y, z));
		return min;
	}

	public static double addition1(double x, double y, double z) {
		double max = Math.max(x, Math.max(y, z));
		return max;
	}
}
