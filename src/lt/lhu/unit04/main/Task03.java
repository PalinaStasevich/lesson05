package lt.lhu.unit04.main;

public class Task03 {

	public static void main(String[] args) {
		int a = 32576435;
		int b = 95621;
		int length1 = 0;
		int length2 = 0;
		length1 = numbers(a);
		length2 = numbers(b);
		if (length1 > length2) {
			System.out.println("В числе " + a + "больше цифр чем в числе " + b);
		} else {
			System.out.println("В числе " + b + "больше цифр чем в числе " + a);
		}

	}

	public static int numbers(int x) {
		int counter = 0;
		while (x / 10 != 0) {
			counter++;
			x = x / 10;
		}
		counter++;
		return counter;
	}
}
