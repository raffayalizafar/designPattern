package homeWork.h10;

public class InvoiceTest {

	public static void main(String[] args) {
		Customer customer = new Customer(123,"Ali",200);
		Invoice invoice = new Invoice(1234, customer,1000);
		System.out.println(invoice.toString());
		System.out.println(invoice.getAmountAfterDiscount());
	}

}
