package prog1_te17.metoder;

import java.util.Arrays;

public class Metoder_arrayer {

	public static int calcArrayMedelvärde(int[] a) {
		int summa = 0;

		for (int i = 0; i < a.length; i++) {

			summa += a[i];

		}

		return summa / a.length;

	}

	public static void arrayTest(int[] b) {

		b[0] = 10;

	}

	public static void main(String[] args) {

		int[] a = new int[3];

		a[0] = 4;
		a[1] = 5;
		a[2] = 6;

		int medel = calcArrayMedelvärde(a);
		System.out.println(medel);

		int[] b = { 1, 2, 3, 4 };

		arrayTest(b);

		System.out.println(Arrays.toString(b));

	}

}
