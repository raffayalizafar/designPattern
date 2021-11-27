package oop.bookarray;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public Author[] getAuthors() {
		return authors;
	}
//	public void setAuthor(Author author) {
//		this.author = author;
//	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", authors=" + getAuthorName() + ", price=" + price + ", qty=" + qty + "]";
	}
	
	public String getAuthorName() {
		return authors[0]+", "+authors[1];	
	}
}
