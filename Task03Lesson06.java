package lt.lhu.unit04.main;

public class Task03Lesson06 {

	public static void main(String[] args) {
		int k = 10000;
		for (int x = 1; x < k; x++) {
			boolean result = isArmstrongNumber(x);
			if (result) {
				System.out.println(x);
			}
		}
	}

	public static boolean isArmstrongNumber(int n) {
		int sum = 0;
		int temp = n;
		int remainder = 0;
		int digits = 0;
		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}
		temp = n;
		while (temp != 0) {
			remainder = temp % 10;
			sum = sum + findSum(remainder, digits);
			temp = temp / 10;
		}
		if (n == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static int findSum(int n, int r) {
		int c = 1;
		int p = 1;
		for (c = 1; c <= r; c++)
			p = p * n;
		return p;
	}

}
