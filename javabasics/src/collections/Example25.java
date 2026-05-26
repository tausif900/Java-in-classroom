package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Example25 {
	public static void main(String[] args) {
		Product p1 = new Product(101, "Laptop", 15000);
		Product p2 = new Product(102, "Mobile", 15000);
		Product p3 = new Product(103, "HeadPhone", 2000);
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);

		products.stream().forEach(p -> System.out.println(p));
		System.out.println("-----------------");
		List<String> productsName = products.stream().map(p -> p.getName()).toList();

		System.out.println(productsName);
		System.out.println("-----------------");
		products = products.stream().map((p) -> new Product(p.getId(), p.getName(), p.getPrice() + 2000)).toList();

		System.out.println(products);
		System.out.println("-----------------");
		List<Product> list = products.stream().filter(p -> p.getPrice() < 10000).toList();

		System.out.println(list);
		System.out.println("-----------------");
		List<Product> productsStartWithM = products.stream().filter(p -> p.getName().startsWith("M")).toList();
		System.out.println(productsStartWithM);
	}
}
