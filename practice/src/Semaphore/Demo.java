package Semaphore;

import java.util.concurrent.Semaphore;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		Semaphore pass = new Semaphore(1);
		
		BridgeCrossingTask task = new BridgeCrossingTask(pass);
		
		new Thread(task,"Green Train").start();
		Thread.sleep(1000);
		new Thread(task,"Allam Iqbal Express").start();
	}
	
}