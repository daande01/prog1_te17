package grafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �kaMinska extends JFrame {

	int number = 0;

	public �kaMinska() {

		JButton minska = new JButton("minska");
		JButton �ka = new JButton("�ka");
		JLabel taltext = new JLabel("0");
		setLayout(new FlowLayout());

		minska.addActionListener(e -> {

			int tal = --number;

			taltext.setText(" " + tal);

		});
		�ka.addActionListener(e -> {

			int tal = ++number;

			taltext.setText(" " + tal);

		});

		add(minska);
		add(�ka);
		add(taltext);
		setSize(200, 200);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new �kaMinska();

	}

}
