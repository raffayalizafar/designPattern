package StrategyPattern;

public class Demo {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("Code Complete",120);
		Item item2 = new Item("Design Pattern in Java : a practical tutorial",100);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.setPaymentMethod(new PaypalStrategy("myemail@example.com","mypwd@example.com"));
		cart.checkOut();
		
		cart.setPaymentMethod(new CreditCardStrategy("Ali","1232132","1234","21/12"));
		cart.checkOut();
	}

}
