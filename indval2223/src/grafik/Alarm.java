package grafik;

import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class Alarm {

	private Timer timer = new Timer();

	public Alarm() {



	}


	public String getLarmTid() {

		String alarm=JOptionPane.showInputDialog("alarm tid hh:mm");

		return alarm;
	}

	public void setLarm(String tid ) {

		System.out.println(LocalDateTime.now().getHour());
		timer.scheduleAtFixedRate(new TimerTask() {
			  @Override
			  public void run() {
				  int hh= LocalDateTime.now().getHour();
				  int mm= LocalDateTime.now().getMinute();
				  //hh:mm
				 int larmhh =Integer.parseInt(tid.substring(0,2));
				 int larmmm=Integer.parseInt(tid.substring(3,5));
				 System.out.println(hh+" "+mm);

				 if (hh==larmhh && mm==larmmm) {

				   Toolkit.getDefaultToolkit().beep();
			   }

			  }
			},1000 ,1000);
	}


	public static void main(String[] args) {

		Alarm a1=new Alarm();
		String atid=a1.getLarmTid();
		a1.setLarm(atid);


		//Toolkit.getDefaultToolkit().beep();

	}
}
