package lt.lhu.unit04.main;

public class Task01 {

	public static void main(String[] args) {
		int a = 164;
		int b = 8;
		int nod = 0;
		int nok = 0;
		nod = findNOD(a, b);
		nok = findNOK(a, b);
		System.out.println("НОД (" + a + ", " + b + ") = " + nod);
		System.out.println("НОК (" + a + ", " + b + ") = " + nok);
	}

	public static int findNOD(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return findNOD(y, x % y);
		}
	}

	public static int findNOK(int x, int y) {
		return x * y / findNOD(x, y);
	}

}
