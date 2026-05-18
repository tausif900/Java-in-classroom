package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example3 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(50);
		numbers.add(25);
		numbers.add(30);
		numbers.add(35);

//		Collections is a class that has static methods.

		Collections.sort(numbers);
		System.out.println(numbers);
//		We have two interfaces 'Comparable' and 'Comparator'.
//		Comaparator says hume kaise arrange krna h numbers ko.
//		Comparator - it is a  Functional interface 

		Collections.sort(numbers, (a, b) -> b - a);
		System.out.println(numbers);

		Collections.sort(numbers, (a, b) -> (b % 10) - (a % 10));
		System.out.println(numbers);
	}
}
