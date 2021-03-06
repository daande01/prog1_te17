package grafikfigurer;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Boll2 extends JComponent {

	private int x = 0;
	private int y = 0;

	private int xv = 1;
	private int yv = 1;

	public Boll2() {

		Timer t = new Timer(40, e -> {

			int height = this.getHeight();
			int width = this.getWidth();

			update(height, width);

			repaint();

		});
		t.start();

	}

	public void update(int h, int w) {

		yv = yv + 1;
		x += 1;
		y += yv;

		System.out.println(yv);

		if (y > h - 50) {

			yv = -yv;

		}

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.fillOval(x, y, 50, 50);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();

		f.setContentPane(new Boll2());
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}

}
