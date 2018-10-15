package prog1_te17;

import java.util.Scanner;

public class Felsökning {
public static void main(String[] args) {
	
	Scanner input =new Scanner(System.in) ;//scanner
			
	System.out.print("tal A:");
	int talA= input.nextInt();
	
	System.out.print("tal B:");
	int talB= input.nextInt();
	
	System.out.print("tal C:");
	int talC= input.nextInt();
	
	int summa = talA + talB + talC;
	double medel = summa /3;
	
	
	System.out.println("summa :"+summa);
	System.out.println("medel:"+medel);
	
	
	input.close();
}
	
	
	
}
