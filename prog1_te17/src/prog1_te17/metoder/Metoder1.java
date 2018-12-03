package prog1_te17.metoder;

public class Metoder1 {

	public static void printText() {

		System.out.println("hej");

	}

	public static void summa(int a, int b) {

		a = a + 12;
		int summa = a + b;
		System.out.println("summa:" + summa);

	}

	public static int sub(int a, int b) {

		return a - b;

	}

	// One rule-of-thumb: ask yourself "does it make sense to call this method, even
	// if no Obj has been constructed yet?" If so, it should definitely be static.

}
