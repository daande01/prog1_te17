package grafikflerabollar;

import java.awt.Color;
import java.awt.Graphics;

public class Boll {

	double x = 0;
	double y = 0;

	double xv = 1;
	double yv = 1;

	public Boll(double x, double y, double xv, double yv) {

		this.x = x;
		this.y = y;
		this.xv = xv;
		this.yv = yv;

	}

	public void rita(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(x(), y(), 20 * 2, 20 * 2);

	}

	public int x() {

		return (int) Math.round(x);
	}

	public int y() {
		return (int) Math.round(y);

	}

	public void updatera(int h, int w) {

		yv = yv + 1;

		if (y > h - 40) {

			yv = -yv;

		}
		x += 1;
		y += yv;

		// System.out.println(yv);

	}

}
