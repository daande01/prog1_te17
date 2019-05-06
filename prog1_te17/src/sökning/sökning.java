package sökning;

public class sökning {

	private int[] tal = { 9, 4, 6, 7, 3, 9, 0 };




	public static void main(String[] args) { n

		sökning s1 = new sökning();

		int svar = s1.linjärsökning(9);

	}



	private int linjärsökning(int sökttal) {

		for (int i = 0; i < tal.length; i++) {

			if (tal[i] == sökttal) {

				return i;

			}
		}

		return -1;

	}

}
