package objekt;

public class Tidpunkt {

	private int t, m, s;
	private static String tjugofyratimmarsvisning = "12";

	public Tidpunkt(int timmar, int minuter, int sekunder) {

		if ((timmar < 24 && timmar >= 0) && (minuter < 60 && minuter >= 0) && (sekunder < 60 && sekunder >= 0)) {
			t = timmar;
			m = minuter;
			s = sekunder;
		} else {

			System.out.println("Du har angivit en felaktig tidpunkt");
		}

	}

	   public void ticka() {        // stegar fram tiden en sekund
		     s = s+1;
		     if (s==60) {
		       s = 0;
		       m = m+1;
		     }
		     if (m==60) {
		       m = 0;
		       t = t+1;
		     }
		     if (t==24)
		       t=0;
		   }

		   public void ändraTid(int i) {
		     while (i>0) {
		       ticka();
		       i = i - 1;
		     }
		   }
	@Override
	public String toString() {

		return "" + t + ":" + m + ":" + s;

	}

	public static void main(String[] args) {

		Tidpunkt t = new Tidpunkt(23, 23, 23);
		Tidpunkt t2 = new Tidpunkt(12, 12, 12);

		t.ändraTid(7200);

		System.out.println(t.toString());
		System.out.println(t2.toString());

	}

}
