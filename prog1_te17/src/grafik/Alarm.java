package grafik;

import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class Alarm {

	public static void main(String[] args) throws InterruptedException {

		String alarmtid = JOptionPane.showInputDialog("ange tid i formatat hh:mm");

		String hh = alarmtid.substring(0, alarmtid.indexOf(":"));
		String mm = alarmtid.substring(alarmtid.indexOf(":") + 1);

		int h = Integer.parseInt(hh);
		int m = Integer.parseInt(mm);




		TimerTask task = new TimerTask() {
			@Override
			public void run() {

				System.out.println("run");

				int datorh = LocalDateTime.now().getHour();
				int datorm = LocalDateTime.now().getMinute();

				if (h == datorh && m == datorm) {

					for (int i = 0; i <= 10; i++) {

						Toolkit.getDefaultToolkit().beep();
						System.out.println("loop");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}

			}
		};
		Timer timer = new Timer("Timer");

		long delay = 1000L;
		long period = 1000L;
		timer.schedule(task, delay, period);






	}

}

