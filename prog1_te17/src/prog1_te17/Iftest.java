package prog1_te17;

import javax.swing.JOptionPane;

public class Iftest {

	public static void main(String[] args) {

		String s = JOptionPane.showInputDialog(null, "vikt godis i hg? ");

		double vikt = Double.parseDouble(s);

		s = JOptionPane.showInputDialog(null, "pris per hg");

		double prisPerHg = Double.parseDouble(s);

		double kostnad;

		if (vikt > 5) {

			kostnad = prisPerHg * vikt * 0.9;

		} else {

			kostnad = prisPerHg * vikt;

		}

		System.out.println("kostnad:" + kostnad);

	}

}
