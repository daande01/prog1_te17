package grafikfigurer;


import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Figur1 extends JComponent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        frame.setSize(500, 500);
        frame.setContentPane(new Figur1());



        frame.setVisible(true);
    }

    @Override
	public void paint(Graphics g) {
        g.fillOval(100, 100, 200, 200);
    }






}