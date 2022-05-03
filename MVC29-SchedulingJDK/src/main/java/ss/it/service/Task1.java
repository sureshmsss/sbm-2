package ss.it.service;

import java.util.Date;
import java.util.TimerTask;

public class Task1 extends TimerTask {

	@Override
	public void run() {
		System.out.println("----start-----");
		System.out.println("from task 2 : " + new Date());
		System.out.println("-----end----");
	}
}
