package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Example4 {
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

		System.out.println("---------------------------------");

//		Price wise Ascending
		Collections.sort(products, (o1, o2) -> o1.getPrice() - o2.getPrice());
		System.out.println(products);
		
//		Price wise Descending
		Collections.sort(products, (o1, o2) -> o2.getPrice() - o1.getPrice());
		System.out.println(products);
		
//		Name wise Ascending...We have compare to method to comapre two strings of an obj.
		Collections.sort(products, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(products);
		
//		Name wise Descending
		Collections.sort(products, (o1, o2) -> o2.getName().compareTo(o1.getName()));
		System.out.println(products);
		
//		Id wise Ascending	
		Collections.sort(products, (o1, o2) -> o1.getId() - o2.getId());
		System.out.println(products);
		
//		Id wise Descending
		Collections.sort(products, (o1, o2) -> o2.getId() - o1.getId());
		System.out.println(products);
	}
}
