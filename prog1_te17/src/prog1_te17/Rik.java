package prog1_te17;

public class Rik {

	public static void main(String[] args) {

		int l�n = 1;
		int dag = 0;
		int kapital=0;


		while (kapital < 1000000) {

			l�n = l�n * 2;
			dag++;
			kapital=kapital+l�n;

		}
		System.out.println(kapital +"dag nummer :"+dag);
	}
}
