package collections;

import java.util.PriorityQueue;

public class Example16 {
	public static void main(String[] args) {
		Product p1 = new Product(101, "Laptop", 45000);
		Product p2 = new Product(102, "Mobile", 15000);
		Product p3 = new Product(103, "HeadPhone", 2000);

		PriorityQueue<Product> products = new PriorityQueue<Product>((a, b) -> b.getId() - a.getId());

		products.add(p1);
		products.add(p2);
		products.add(p3);
		System.out.println(products);
	}
}
