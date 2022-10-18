package lt.lhu.unit04.main;

public class Task03Lesson06 {

	public static void main(String[] args) {
		int k = 9999;
		for (int x = 1; x < k; x++) {
			double sum = findSum(x);
			if (sum == x) {
				System.out.println(x);
			}
		}
	}

	public static int findCount(int x) {
		int temp = 0;
		do {
			temp++;
			x /= 10;
		} while (x != 0);
		return temp;
	}
	public static double findSum(int x) {
		double sum = 0;
		int y;
		while (x > 1) {
			y = (int) Math.pow(x % 10, findCount(x));
			sum = sum + y;
			x = x / 10;
		}
		return sum;
	}

}
