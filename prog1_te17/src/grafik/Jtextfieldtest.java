package grafik;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jtextfieldtest extends JFrame {


	private JTextField  f1= new JTextField(10);

	private JLabel l1 = new JLabel("");

	public Jtextfieldtest() {

		setLayout(new FlowLayout());
		this.add(f1);
		this.add(l1);
		f1.addActionListener(e->{

			String text=f1.getText();

			l1.setText(text);

		});
		setVisible(true);
		setSize(200,200);

	}







	public static void main(String[] args) {


		new Jtextfieldtest();

	}
}
