package prog1_te17.metoder;

import java.util.Arrays;

public class Metoder_array1 {


	public static void changePosEttToHundra(int [] f) {


		f[0]=100;


	}




	public static double ber�knaMedelV�rde(int [] a) {

		int summa=0;

		for (int i = 0; i < a.length; i++) {

			 summa = summa+a[1];


		}

		return summa/a.length;
	}

	public static void main(String[] args) {

		int [] a= new int [3];

		a[0]=1;
		a[1]=2;
		a[2]=3;


		System.out.println(ber�knaMedelV�rde(a));


		changePosEttToHundra(a);

		System.out.println(Arrays.toString(a));




	}


}
