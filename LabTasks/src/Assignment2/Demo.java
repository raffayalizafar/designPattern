package Assignment2;

public class Demo {

	public static void main(String[] args) {
		throws InterruptedException{
			final Cook cook = new Cook();
			Thread t1 = new Thread(new Runnable() {
				public void run() {
					try {
						cook.prepareOrder();
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			Thread t2 = new Thread(new Runnable() {
				public void run() {
					try {
						cook.prepareOrder();
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
		}
	}

}
