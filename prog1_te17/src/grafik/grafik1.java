package grafik;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class grafik1 extends JFrame implements ActionListener {

	JLabel l1 = new JLabel();


	public grafik1() {

		setLayout(new FlowLayout());
		add(l1);
		l1.setText("start");
		setSize(200, 200);
		setVisible(true);

		TimerTask task = new TimerTask() {
	        @Override
			public void run() {

	        	System.out.println("run");

	    		int datorh = LocalDateTime.now().getHour();
	    		int datorm = LocalDateTime.now().getMinute();
	    		int dators= LocalDateTime.now().getSecond();

	    		l1.setText(""+datorh+":"+datorm+":"+dators);


	        }
	    };
	    Timer timer = new Timer("Timer");

	    long delay  = 1000L;
	    long period = 1000L;
	    timer.schedule(task, delay,period);





	}


	@Override
	public void actionPerformed(ActionEvent e) {

	}



	public static void main(String[] args) {


		grafik1 g= new grafik1();




	}





}
