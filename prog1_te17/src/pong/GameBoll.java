package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class GameBoll extends JComponent {

	public LinkedList<Boll> b = new LinkedList<Boll>();
	public LinkedList<Boll> toRemove = new LinkedList<Boll>();

	public GameBoll() {

		for (int i = 0; i < 10; i++) {

			b.add(new Boll((Math.random() * 500), (Math.random() * 500), 1, 1,
					new Color((int) (Math.random() * 0x1000000)), 20));

		}

		Timer t = new Timer(40, e -> {

			int height = this.getHeight();
			int width = this.getWidth();

			for (Boll boll : b) {

				boll.update(height, width);
				if (boll.kollition(b)) {

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					toRemove.add(boll);

				}
			}
			b.removeAll(toRemove);

			repaint();

		});
		t.start();

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		for (Boll boll : b) {

			boll.rita(g);
		}

	}

	public static void main(String[] args) {

		JFrame f = new JFrame();

		f.setContentPane(new GameBoll());
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}
}
