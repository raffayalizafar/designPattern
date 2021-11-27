package oop.book;

public class BookTest {

	public static void main(String[] args) {
		Author a= new Author("Best","Best@com",'m');
		Book b= new Book("Physics",a,100);
		System.out.println(b);

	}

}
