package grafikfigurer;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Trafikljus2 extends JComponent {


	public Trafikljus2() {

			Timer t = new Timer(100, e->{




			});
			t.start();

		}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.setColor(Color.red);
		g.fillOval(200, 200, 20, 20);
	}






public static void main(String[] args) {

	JFrame f = new JFrame("ljus");

	f.setContentPane(new Trafikljus2());

	f.setVisible(true);
	f.setSize(400, 400);


}



}
