package grafikfigurer;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class MussePigg extends JComponent{




	public MussePigg() {



	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.fillOval(200,200 , 100, 100);
		g.fillOval(175,175 , 50, 50);
		g.fillOval(275,175 , 50, 50);
		g.setColor(Color.white);
		g.fillOval(240, 240, 20, 20);

	}


public static void main(String[] args) {

	JFrame f = new JFrame("musse");

	f.setLayout(new FlowLayout());


	f.setContentPane(new MussePigg());


	f.setVisible(true);
	f.setSize(400, 400);

}

}
