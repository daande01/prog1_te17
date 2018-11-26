package prog1_te17;

public class Hiss {

	 private int våning;
	 private int min;
	 private int max;


	public Hiss(int v,int mi, int ma) {
		min=mi;
		max=ma;
		våning =v;
		System.out.println(våning);
	}


	public void move(int önskadVåning) {

		if(önskadVåning<max && önskadVåning>min) {
		våning=önskadVåning;
		}

	}
	public int getVåning() {


		return våning;

	}





}
