package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

public class Boll {

	double x, y, xv, yv;

	Color F�rg;

	int radie;

	public Boll(double x, double y, double xv, double yv, Color f�rg, int radie) {

		this.x = x;
		this.y = y;
		this.xv = xv;
		this.yv = yv;
		this.radie = radie;
		this.F�rg = f�rg;

	}

	public void rita(Graphics g) {

		g.setColor(F�rg);
		g.fillOval(x(), y(), radie * 2, radie * 2);

	}

	public int x() {

		return (int) Math.round(x);
	}

	public int y() {

		return (int) Math.round(y);

	}

	public boolean kollition(LinkedList<Boll> b) {

		for (Boll boll : b) {

			System.out.print(Math
					.sqrt(Math.pow(boll.x + radie - this.x + radie, 2) + Math.pow(boll.y + radie - this.y + radie, 2)));

			System.out.println("=" + (this.radie + boll.radie));

			if (Math.sqrt(Math.pow(boll.x + boll.radie - this.x + this.radie, 2) + Math.pow(boll.y + boll.radie - this.y + this.radie, 2)) <= (this.radie + boll.radie)) {

				return true;

			}

		}
		return false;

	}

	public void update(int h, int w) {



		yv = yv + 1;

		x += 1;


		y += yv;

		// System.out.println(yv);





		if (y >= h - 50) {

			yv = -yv;

		}

		if (y > h - 50 && yv > 1) {

			y = h - 50;
		}

	}

}
