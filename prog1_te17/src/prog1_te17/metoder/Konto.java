package prog1_te17.metoder;

public class Konto {

	static int ränta=10;

	public int saldo=0;

	public int personnummer;

	public Konto(int p,int s) {

		if (s>=0) {

			saldo=s;
		}

		personnummer=p;

	}

	public int getSaldo() {

		return saldo;



	}

	public  void calcInt() {

		saldo=saldo*(1+(ränta/100));




	}



	public static void main(String[] args) {


		Konto k1 =new Konto(828205,40);

		k1.calcInt();

		System.out.print(k1.getSaldo());


	}




}
