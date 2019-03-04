package grafikflerabollar;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Bollgame extends JComponent {

	private Boll boll;
	private Boll boll2;

	public Bollgame() {

		boll = new Boll((Math.random() * 200), (Math.random() * 300), 0, 3);
		boll2 = new Boll((Math.random() * 200), (Math.random() * 300), 0, 3);

		Timer t = new Timer(40, e -> {

			int height = this.getHeight();
			int width = this.getWidth();
			// System.out.println("boll "+boll.yv);
			// System.out.println("boll2 "+boll2.yv);
			boll.updatera(height, width);
			boll2.updatera(height, width);

			repaint();

		});
		t.start();

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		boll.rita(g);
		boll2.rita(g);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();

		f.setContentPane(new Bollgame());
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}

}
