package grafikfigurer;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Trafikljus2 extends JComponent implements KeyListener {


	boolean redbool = true;
	static Timer t ;
	public Trafikljus2() {

		setPreferredSize(new Dimension(240, 240));

		 t = new Timer(1000, e -> {

			this.repaint();

		});
		t.start();

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		if (redbool == true) {
			g.setColor(Color.red);
			g.fillOval(200, 200, 20, 20);
			redbool = false;
		} else {

			redbool = true;
		}

	}

	public static void main(String[] args) {

		Trafikljus2 t2 = new Trafikljus2();
		JFrame f = new JFrame("ljus");
		JButton b = new JButton("stop");

		b.addActionListener(e->{

			t.stop();

		});

		JPanel p = new JPanel();

		p.add(b);
		p.add(t2);

		Container c = f.getContentPane();
		c.add(p);
		f.pack();

		f.setSize(400, 400);
		f.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		if (key ==KeyEvent.VK_LEFT ) {

			System.out.print("left");

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

}
