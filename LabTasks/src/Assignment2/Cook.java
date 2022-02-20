package Assignment2;

import java.util.LinkedList;

public class Cook {
	LinkedList<Integer> list=new LinkedList<Integer>();
	int capacity=3;
	public void prepareOrder() throws InterruptedException{
		int value=0;
		while(true) {
			synchronized(this) {
				while(list.size()==capacity) {
					wait();
				}
				System.out.println("Cook Prepared "+value);
				list.add(value++);
				notify();
				Thread.sleep(1000);
			}
		}
	}
	public void served() throws InterruptedException{
		while(true) {
			synchronized(this) {
				while(list.size()==0) {
					wait();
				}
				int val=list.removeFirst();
				System.out.println("Served Order "+val);
				notify();
				Thread.sleep(1000);
			}
		}
	}
}