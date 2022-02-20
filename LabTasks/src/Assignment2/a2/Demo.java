package Assignment2.a2;

public class Demo {

	public static void main(String[] args) {
		Cook cook=new Cook();
		cook.start();
		Waiter waiter1=new Waiter(cook,"Waiter 1");
		waiter1.start();
		Waiter waiter2=new Waiter(cook,"Waiter 2");
		waiter2.start();
	}

}
