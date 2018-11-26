package prog1_te17;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grafiktest extends JFrame implements ActionListener  {

	private JButton b1= new JButton("tryck");
	private JLabel text=new  JLabel("hej");
	
	public Grafiktest() {
		
		setLayout(new FlowLayout());
		add(text);
		add(b1);
		b1.addActionListener(this);
		setVisible(true);
		setSize(200,200);
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		text.setText("Hej då");
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		new Grafiktest();
		new Grafiktest();
	}

}
