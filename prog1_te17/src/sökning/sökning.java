package s�kning;

public class s�kning {

	private int[] tal = { 9, 4, 6, 7, 3, 9, 0 };




	public static void main(String[] args) { n

		s�kning s1 = new s�kning();

		int svar = s1.linj�rs�kning(9);

	}



	private int linj�rs�kning(int s�kttal) {

		for (int i = 0; i < tal.length; i++) {

			if (tal[i] == s�kttal) {

				return i;

			}
		}

		return -1;

	}

}
