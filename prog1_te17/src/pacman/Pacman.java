package pacman;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Pacman extends JComponent implements KeyListener {

	int x = 100;
	int y = 100;
	int width;
	int height;
	int vx = 1;
	int vy = 1;
	boolean måla = true;
	double time;
	int[] xpoly = new int[3];
	int[] ypoly = new int[3];
	int[] xpolyn = new int[3];
	int[] ypolyn = new int[3];

	public Pacman() {

		this.addKeyListener(this);
		xpoly[0] = this.x;
		xpoly[1] = this.x + 20;
		xpoly[2] = this.x - 20;
		ypoly[0] = this.y;
		ypoly[1] = this.y + 20;
		ypoly[2] = this.y + 20;
		Timer blink = new Timer(200, e -> {

			xpoly[0] = xpoly[0] - x;
			xpoly[1] = xpoly[1] - x;
			xpoly[2] = xpoly[2] - x;
			ypoly[0] = ypoly[0] - y;
			ypoly[1] = ypoly[1] - y;
			ypoly[2] = ypoly[2] - y;

			int[] newxpoly = new int[3];

			System.arraycopy(xpoly, 0, newxpoly, 0, xpoly.length);

			int[] newypoly = new int[3];

			System.arraycopy(ypoly, 0, newypoly, 0, ypoly.length);

			int vinkel = 1;

			System.out.println(((newxpoly[1] * Math.cos(Math.toRadians(vinkel)))
					- (newypoly[1] * Math.sin(Math.toRadians(vinkel)))));
			System.out.println(((newypoly[1] * Math.cos(Math.toRadians(vinkel)))
					+ (newxpoly[1] * Math.sin(Math.toRadians(vinkel)))));

			xpoly[1] = (int) ((newxpoly[1] * Math.cos(Math.toRadians(vinkel)))
					- (newypoly[1] * Math.sin(Math.toRadians(vinkel))));
			xpoly[2] = (int) ((newxpoly[2] * Math.cos(Math.toRadians(vinkel)))
					- (newypoly[2] * Math.sin(Math.toRadians(vinkel))));

			ypoly[1] = (int) ((newypoly[1] * Math.cos(Math.toRadians(vinkel)))
					+ (newxpoly[1] * Math.sin(Math.toRadians(vinkel))));
			ypoly[2] = (int) ((newypoly[2] * Math.cos(Math.toRadians(vinkel)))
					+ (newxpoly[2] * Math.sin(Math.toRadians(vinkel))));

			System.out.println("ypoly1" + ypoly[1]);

			System.out.println(Arrays.toString(xpoly));
			System.out.println(Arrays.toString(ypoly));

			// Arrays.toString(ypolyn);

			xpoly[0] = xpoly[0] + x;
			xpoly[1] = xpoly[1] + x;
			xpoly[2] = xpoly[2] + x;
			ypoly[0] = ypoly[0] + y;
			ypoly[1] = ypoly[1] + y;
			ypoly[2] = ypoly[2] + y;

			repaint();

			if (måla == true) {

				måla = false;
			} else {
				måla = true;
			}

		});

		blink.start();

		Timer t1 = new Timer(100, e -> {

			repaint();

			height = this.getHeight();
			width = this.getWidth();

			updatera(width, height);
		});
		t1.start();

	}

	private void updatera(int w, int h) {

		/*
		 * vy = vy + 1; x += vx; y += vy;
		 *
		 * if (h < y + 20) {
		 *
		 *
		 * vy = -vy;
		 *
		 * }
		 */
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 40, 40);

		g.setColor(Color.PINK);

		int n = 3;

		Polygon p = new Polygon(xpoly, ypoly, n); // This polygon represents a triangle with the above

		if (måla == true) {
			g.fillPolygon(p);

		}

	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setContentPane(new Pacman());
		f.setBackground(Color.black);
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {

			y = y - 10;

		}
		if (key == KeyEvent.VK_DOWN) {

			y = y + 10;

		}
		if (key == KeyEvent.VK_LEFT) {

			x = x - 10;

		}
		if (key == KeyEvent.VK_RIGHT) {

			x = x + 10;

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isFocusTraversable() {
		return true;
	}

}
