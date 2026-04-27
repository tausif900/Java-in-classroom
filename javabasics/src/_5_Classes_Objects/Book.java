package _5_Classes_Objects;

public class Book {
//	Instance variable is a variable of object
	int bookId;
	String bookName;
	int bookPrice;

//	Constructor Called automatically when the object is created.
//	Constructor......, Constructor name should be same as Class name
//	Non-Parameterised Constructor
	Book() {
		System.out.println("Book Obj created");
	}

//	Parameterised Constructor
	Book(int bookId, String bookName, int bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
//	Static obj ko belong ni krta ,class ko krta h

//	Book20% Book30% Book40%
//	function belongs to the obj

}
