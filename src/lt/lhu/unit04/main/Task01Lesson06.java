package lt.lhu.unit04.main;

public class Task01Lesson06 {

	public static void main(String[] args) {
		int a = 15;
		int b = 17;
		int c = 23;
		int nod1 = findNOD(a, b);
		int nod2 = findNOD(a, c);
		int nod3 = findNOD(b, c);
		if ((nod1 == 1) & (nod2 == 1) & (nod3 == 1)) {
			System.out.println("Это взаимно простые числа");
		} else {
			System.out.println("Числа не являются взаимно простыми");
		}

	}

	public static int findNOD(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return findNOD(y, x % y);
		}
	}

}
