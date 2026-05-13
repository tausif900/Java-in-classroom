package polymorphism;

public class Main {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add(5, 7);
		c1.add(7.526, 6);
		c1.add(6, 7.52);
		c1.add(12, 30, 9);

		Book b1 = new Book(101, "FairyTales");
		Book b2 = new Book(102, "Ali Baba Chalees Chor", 200);
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.getBookId());
		System.out.println(b2.getBookName());
	}
}
