package Assignment2.a2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cook extends Thread {
	private final int shelfSize=3;
	private final List<Integer> shelf=new ArrayList<>();
	Random time=new Random();
	int i=0;
	@Override
	public void run() {
		try {
			while(i<100) {
				cook();
				i++;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private synchronized void cook() throws InterruptedException {
		while(shelf.size()==shelfSize) {
			System.out.println("Shelf is full");
			wait();
		}
		int orderNo=time.nextInt(100);
		int cookingTime=time.nextInt(10);
		String message="Cook prepared order no. "+orderNo+" in "+cookingTime+" seconds";
		System.out.println(message);
		shelf.add(orderNo);
		notify();
	}
	public synchronized int servedOrder() throws InterruptedException {
		notify();
		while(shelf.isEmpty()) {
			wait();
		}
		int orderNo=shelf.get(0);
		shelf.remove(shelf.indexOf(orderNo));
		return orderNo;
	}
	public synchronized int unServedOrders() {
		return shelf.size();
	}
}