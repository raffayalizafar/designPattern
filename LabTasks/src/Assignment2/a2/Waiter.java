package Assignment2.a2;

public class Waiter extends Thread {
	private Cook cook;
	private String threadName;
	public Waiter(Cook cook,String threadName) {
		this.cook=cook;
		this.threadName=threadName;
	}
	@Override
	public void run() {
		try {
			while(true) {
				int orderNo=cook.servedOrder();
				int orderPending=cook.unServedOrders();
				System.out.println(threadName+": serving order no. "+orderNo+", "+orderPending+" unserved orders on the shelf");
				Thread.sleep(1500);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
