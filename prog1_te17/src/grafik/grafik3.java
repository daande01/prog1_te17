package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class grafik3 extends JFrame {

	JTextField f1 = new JTextField();

	public grafik3() {

		setLayout(new FlowLayout());
		add(f1);
		f1.setPreferredSize(new Dimension(200, 24));
		f1.addActionListener(e -> {
			String text = f1.getText();
			System.out.println(text);

		});
		setSize(200, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		grafik3 g1 = new grafik3();

	}

}
