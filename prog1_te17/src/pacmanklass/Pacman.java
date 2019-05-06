package pacmanklass;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
	boolean måla= true;
	double time;
	public Pacman() {

		this.addKeyListener(this);


		Timer blink = new Timer(200, e -> {

			if(måla==true) {

				måla= false;
			}else {
				måla=true;
			}
		});

		blink.start();





		Timer t1 = new Timer(10, e -> {


			repaint();

			height = this.getHeight();
			width = this.getWidth();

			updatera(width, height);
		});
		t1.start();

	}

	private void updatera(int w, int h) {

		/*
		vy = vy + 1;
		x += vx;
		y += vy;

		if (h < y + 20) {


			vy = -vy;

		}
	*/
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 40, 40);


		int [] x= new int[3];
		int [] y= new int [3];

		g.setColor(Color.black);

		x[0]=this.x; x[1]=this.x+20; x[2]=this.x-20;
		y[0]=this.y; y[1]=this.y+20; y[2]=this.y+20;
		int n = 3;

		Polygon p = new Polygon(x, y, n);  // This polygon represents a triangle with the above
		                                   //   vertices.

		if (måla==true) {
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

			int key=e.getKeyCode();

		if(key==KeyEvent.VK_UP) {

			y=y-10;


		}if(key==KeyEvent.VK_DOWN) {

			y=y+10;


		}if(key==KeyEvent.VK_LEFT) {

			x=x-10;


		}if(key==KeyEvent.VK_RIGHT) {

			x=x+10;


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
