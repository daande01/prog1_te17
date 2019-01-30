package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Grafik2 extends JFrame implements ActionListener {

	JTextField f1 = new JTextField();

	public Grafik2() {

		setLayout(new FlowLayout());
		add(f1);
		f1.setPreferredSize(new Dimension(200, 24));
		f1.addActionListener(this);
		setSize(200, 200);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = f1.getText();
		System.out.println(text);

	}

	public static void main(String[] args) {
		Grafik2 g1 = new Grafik2();

	}

}
