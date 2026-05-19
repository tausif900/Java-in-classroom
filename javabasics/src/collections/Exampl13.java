package collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exampl13 {
	public static void main(String[] args) {
		Product p1 = new Product(101, "Laptop", 15000);
		Product p2 = new Product(102, "Mobile", 15000);
		Product p3 = new Product(103, "HeadPhone", 2000);

//		Here arraylist is of Product type, so it's generics is Product Type.
		TreeSet<Product> products = new TreeSet<Product>((a, b) -> a.getId() - b.getId());
//		in add method, things are added but in set method things are replaced
		products.add(p1);
		products.add(p2);
		products.add(p3);

		System.out.println(products);
	}
}
