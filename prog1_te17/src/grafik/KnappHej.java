package grafik;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KnappHej extends JFrame {

	public KnappHej() {

		JButton j = new JButton("klick");
		JLabel l=new JLabel("hej",new ImageIcon("julia.jpg"),JLabel.CENTER);

		ImageIcon b1 = new ImageIcon("julia.jpg");
		ImageIcon b2 = new ImageIcon("julia2.jpg");

		j.addActionListener(e->{


			if (l.getText()=="hej") {

				l.setText("hej då");
				l.setIcon(b2);

			}else {

				l.setText("hej");
				l.setIcon(b1);

			}



		});

		setLayout(new FlowLayout());
		this.add(j);
		this.add(l);

		setSize(300, 300);
		setVisible(true);


	}

	public static void main(String[] args) {
		new KnappHej();
	}

}
