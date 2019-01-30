package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Grafikjtextfield extends JFrame {
	JButton b1 = new JButton("klick");
	JLabel l1 = new JLabel("start");
	JTextField t1 = new JTextField();

	public Grafikjtextfield() {

		setLayout(new FlowLayout());
		add(t1);
		add(b1);
		add(l1);
		t1.setPreferredSize(new Dimension(100, 20));
		setPreferredSize(new Dimension(400, 400));

		b1.addActionListener(e->{

			String ord=t1.getText();
			l1.setText(ord);
		});

		pack();
		setVisible(true);
	}
	public static void main(String[] args) {

		new Grafikjtextfield();

	}

}
