package pacmanklass;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Arrays;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class polyrotate extends JComponent {

	int x = 200;
	int y = 200;
	int width;
	int height;

	double[] xpoly = new double[3];
	double[] ypoly = new double[3];

	public polyrotate() {

		xpoly[0] = this.x;
		xpoly[1] = this.x + 20;
		xpoly[2] = this.x - 20;
		ypoly[0] = this.y;
		ypoly[1] = this.y + 20;
		ypoly[2] = this.y + 20;

		Timer blink = new Timer(30, e -> {

			xpoly[0] = xpoly[0] - 200;
			xpoly[1] = xpoly[1] - 200;
			xpoly[2] = xpoly[2] - 200;
			ypoly[0] = ypoly[0] - 200;
			ypoly[1] = ypoly[1] - 200;
			ypoly[2] = ypoly[2] - 200;

			double[] newxpoly = new double[3];

			System.arraycopy(xpoly, 0, newxpoly, 0, xpoly.length);

			double[] newypoly = new double[3];

			System.arraycopy(ypoly, 0, newypoly, 0, ypoly.length);

			int vinkel = 1;

			System.out.println(((newxpoly[1] * Math.cos(Math.toRadians(vinkel)))
					- (newypoly[1] * Math.sin(Math.toRadians(vinkel)))));
			System.out.println(((newypoly[1] * Math.cos(Math.toRadians(vinkel)))
					+ (newxpoly[1] * Math.sin(Math.toRadians(vinkel)))));

			xpoly[1] = ((newxpoly[1] * Math.cos(Math.toRadians(vinkel)))
					- (newypoly[1] * Math.sin(Math.toRadians(vinkel))));
			xpoly[2] = ((newxpoly[2] * Math.cos(Math.toRadians(vinkel)))
					- (newypoly[2] * Math.sin(Math.toRadians(vinkel))));

			ypoly[1] = ((newypoly[1] * Math.cos(Math.toRadians(vinkel)))
					+ (newxpoly[1] * Math.sin(Math.toRadians(vinkel))));
			ypoly[2] = ((newypoly[2] * Math.cos(Math.toRadians(vinkel)))
					+ (newxpoly[2] * Math.sin(Math.toRadians(vinkel))));

			System.out.println("ypoly1" + ypoly[1]);

			System.out.println(Arrays.toString(xpoly));
			System.out.println(Arrays.toString(ypoly));

			// Arrays.toString(ypolyn);

			xpoly[0] = xpoly[0] + 200;
			xpoly[1] = xpoly[1] + 200;
			xpoly[2] = xpoly[2] + 200;
			ypoly[0] = ypoly[0] + 200;
			ypoly[1] = ypoly[1] + 200;
			ypoly[2] = ypoly[2] + 200;

			repaint();
		});

		blink.start();

	}

	private void updatera(int w, int h) {

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.setColor(Color.pink);

		int n = 3;

		int[] intxpoly = new int[xpoly.length];
		for (int i = 0; i < intxpoly.length; ++i) {
			intxpoly[i] = (int) xpoly[i];
		}

		final int[] intypoly = new int[ypoly.length];
		for (int i = 0; i < intypoly.length; ++i)
			intypoly[i] = (int) ypoly[i];

		Polygon p = new Polygon(intxpoly, intypoly, n);

		g.fillPolygon(p);

		g.setColor(Color.green);

		g.fillOval(200, 200, 4, 4);

	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setContentPane(new polyrotate());
		f.setBackground(Color.black);
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
