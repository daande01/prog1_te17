package grafikfigurer;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Boll extends JComponent {

	int x = 100;
	int y = 100;
	int width;
	int height;
	int vx = 1;
	int vy = 1;

	public Boll() {

		Timer t1 = new Timer(25, e -> {

			repaint();

			height = this.getHeight();
			width = this.getWidth();

			updatera(width, height);
		});
		t1.start();

	}

	private void updatera(int w, int h) {
		vy = vy + 1;
		x += vx;
		y += vy;
		System.out.println(x + "  " + h);
		if (h < y + 20) {

			System.out.println("sant");
			vy = -vy;

		}

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.fillOval(x, y, 20, 20);

	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setContentPane(new Boll());
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
