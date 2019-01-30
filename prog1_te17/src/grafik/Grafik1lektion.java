package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grafik1lektion extends JFrame implements ActionListener {

	private JButton b1 = new JButton("klick");
	private JButton b2 = new JButton("klick");

	public Grafik1lektion() {
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(400, 300));
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);
		pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			System.out.println("du har klickat påknapp 1");
		} else {

			System.out.println("du har klickat påknapp 2");
		}
	}
	public static void main(String[] args) {

		new Grafik1lektion();
	}
}
