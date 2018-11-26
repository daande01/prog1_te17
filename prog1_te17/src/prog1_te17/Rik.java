package prog1_te17;

public class Rik {

	public static void main(String[] args) {

		int lön = 1;
		int dag = 0;
		int kapital=0;


		while (kapital < 1000000) {

			lön = lön * 2;
			dag++;
			kapital=kapital+lön;

		}
		System.out.println(kapital +"dag nummer :"+dag);
	}
}
