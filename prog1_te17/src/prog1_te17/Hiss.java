package prog1_te17;

public class Hiss {

	 private int v�ning;
	 private int min;
	 private int max;


	public Hiss(int v,int mi, int ma) {
		min=mi;
		max=ma;
		v�ning =v;
		System.out.println(v�ning);
	}


	public void move(int �nskadV�ning) {

		if(�nskadV�ning<max && �nskadV�ning>min) {
		v�ning=�nskadV�ning;
		}

	}
	public int getV�ning() {


		return v�ning;

	}





}
