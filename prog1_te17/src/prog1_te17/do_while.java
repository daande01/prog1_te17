package prog1_te17;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int key = 0;

		do {

			System.out.println("MENY \n 1 1.insättning \n 2.uttag \n 3.visa saldo");
			key = s.nextInt();

			switch (key) {
			case 1:

				System.out.println("in");
				break;
			case 2:

				System.out.println("uttag");
				break;

			case 3:
				System.out.println("saldo");
				break;

			case 4:
				System.out.println("avsluta");
				System.exit(0);
				break;
			default:
				System.out.println("ej korrekt inmatning");

				break;
			}

		} while (key != 4);

	}

}
