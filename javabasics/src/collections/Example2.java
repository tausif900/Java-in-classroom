package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example2 {
	public static void main(String[] args) {
		Product p1 = new Product(101, "Laptop", 45000);
		Product p2 = new Product(102, "Mobile", 15000);
		Product p3 = new Product(103, "HeadPhone", 2000);

//		Here arraylist is of Product type, so it's generics is Product Type.
		ArrayList<Product> products = new ArrayList<Product>();
//		in add method things are added but in set method things are replaced
		products.add(p1);
		products.add(p2);
		products.add(p3);

		System.out.println(products);
//		We can also use lamda exp here...
		Collections.sort(products, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o2.getPrice() - o1.getPrice();
			}
		});

		System.out.println("---------------------------");

		for (Product p : products) {
			System.out.println(p);
		}

		System.out.println("---------------------------");

		products.forEach((p) -> System.out.println(p));
		System.out.println("---------------------------");
		System.out.println(products.size());
		System.out.println(products.isEmpty());
		System.out.println(products.get(1));
		products.remove(0);
		System.out.println(products);

		products.set(1, new Product(104, "Tablet", 25000));
		System.out.println(products);
	}
}
