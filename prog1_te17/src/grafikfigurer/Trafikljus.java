package grafikfigurer;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Trafikljus extends JComponent {

	boolean b = true;
	Timer t1;

	public Trafikljus() {

		this.setPreferredSize(new Dimension(200, 200));
		t1 = new Timer(1000, e -> {

			if (b == true) {

				b = false;
			} else {

				b = true;
			}

			repaint();

		});
		t1.start();

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, 40, 100);

		if (b == true) {
			g.setColor(Color.red);
			g.fillOval(10, 50, 20, 20);

		} else {
			g.setColor(Color.GREEN);
			g.fillOval(10, 10, 20, 20);

		}
	}

	private void stop() {
		t1.stop();
	}

	public static void main(String[] args) {

		Trafikljus t = new Trafikljus();

		JFrame f = new JFrame();
		JButton b = new JButton("klick");
		JPanel p = new JPanel();
		b.addActionListener(e -> {

			t.stop();

		});
		p.add(b);

		p.add(t);

		Container c = f.getContentPane();
		c.add(p);
		f.pack();
		// f.setContentPane(p);

		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
