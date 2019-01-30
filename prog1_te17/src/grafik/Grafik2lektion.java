package grafik;


import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grafik2lektion extends JFrame  {

	public Grafik2lektion() {

		setLayout(new FlowLayout());
		JButton b1 = new JButton("klick");
		JButton b2 = new JButton("klick");
		setPreferredSize(new Dimension(400, 300));
		add(b1);
		add(b2);
		b1.addActionListener(e->{

			System.out.println("du har klickat på b1");

		});

		b2.addActionListener(e->{

			System.out.println("du har klickat på b2");
		});

		setVisible(true);
		pack();

	}


	public static void main(String[] args) {

		new Grafik2lektion();


	}
}
