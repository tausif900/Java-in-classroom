package _5_Classes_Objects;

public class Example_9 {
	public static void main(String[] args) {
		
		Book b1 = new Book(101, "Java Programming", 100);
		Book b2 = new Book(102, "Python Programming", 250);
		new Book();
		
		System.out.println(b2.bookId);
		System.out.println(b2.bookName);
		System.out.println(b2.bookPrice);

		System.out.println(b2.getDiscount("Book30"));
	}
}

// Practice Constructors at home