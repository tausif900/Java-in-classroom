package polymorphism;

public class Book {
	private int bookId;
	private String bookName;
	private int price;

//	Conctructor Over Loading

	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public Book(int bookId, String bookName, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}

}
