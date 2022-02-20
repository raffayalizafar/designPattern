package homeWork.h3;

public class InvoiceItemTest {

	public static void main(String[] args) {
		InvoiceItem invoiceItem = new InvoiceItem("345","DairyMilk",10,100);
		System.out.println(invoiceItem);
		System.out.println(invoiceItem.getTotal());
	}

}
