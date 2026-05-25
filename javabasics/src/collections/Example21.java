package collections;

import java.util.LinkedHashMap;

public class Example21 {
	public static void main(String[] args) {
		LinkedHashMap<String, Product> products = new LinkedHashMap<String, Product>();

		products.put("12345678", new Product(101, "Laptop", 45000));
		products.put("12345679", new Product(102, "Mobile", 35000));
		products.put("12345676", new Product(103, "Tablet", 5000));
		products.put("12345675", new Product(104, "HeadPhone", 4000));

		for (String key : products.keySet()) {
			System.out.println("Barcode No: " + key);
			Product product = products.get(key);
			System.out.println("Id: " + product.getId());
			System.out.println("Name: " + product.getName());
			System.out.println("Price: " + product.getPrice());
			System.out.println("--------------------");
		}
		System.out.println("Products greater than price 40000");
		for (String key : products.keySet()) {

			Product product = products.get(key);
			if (product.getPrice() > 40000) {
				System.out.println("Barcode No: " + key);
				System.out.println("Id: " + product.getId());
				System.out.println("Name: " + product.getName());
				System.out.println("Price: " + product.getPrice());
				System.out.println("--------------------");
			}
		}

		System.out.println("Products starts with M");
		for (String key : products.keySet()) {

			Product product = products.get(key);
			if (product.getName().startsWith("M")) {
				System.out.println("Barcode No: " + key);
				System.out.println("Id: " + product.getId());
				System.out.println("Name: " + product.getName());
				System.out.println("Price: " + product.getPrice());
				System.out.println("--------------------");
			}
		}
	}
}
