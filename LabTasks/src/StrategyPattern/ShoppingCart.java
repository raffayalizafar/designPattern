package StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private PaymentStrategy paymentMethod;
	private List<Item> items =new ArrayList<Item>();
	public void addItem(Item item) {
		items.add(item);
	}
	public int calculateAmount() {
		int amount =0;
		for(Item item : items) {
			amount += item.getPrice();
		}
		return amount;
	}
	public void setPaymentMethod(PaymentStrategy paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public void checkOut() {
		int amount =calculateAmount();
		paymentMethod.pay(amount);
	}
}
