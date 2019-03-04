package grafik;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bild extends JFrame {

	public Bild() {
		JButton knapp = new JButton("knapp");

		JLabel taltext = new JLabel("0", new ImageIcon("julia.jpg"), JLabel.RIGHT);
		setLayout(new FlowLayout());

		add(knapp);

		add(taltext);
		setSize(200, 200);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new Bild();

	}

}
