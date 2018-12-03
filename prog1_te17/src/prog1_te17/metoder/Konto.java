package prog1_te17.metoder;

public class Konto {

	static int ränta = 10;
	private double saldo = 0;
	private int personnummer;

	public Konto(int p, int s) {

		if (s >= 0) {

			saldo = s;
		}
		personnummer = p;
	}

	public double getSaldo() {

		return saldo;

	}

	public void calcInt() {

		saldo = saldo * (1 + (ränta / 100.0));


	}

	public static void main(String[] args) {


		Konto daniel = new Konto(828205, 40);
		daniel.calcInt();
		System.out.print(daniel.getSaldo());

	}

}
