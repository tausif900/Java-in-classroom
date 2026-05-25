package collections;

import java.util.HashMap;
import java.util.Scanner;

public class Example20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(101, "Tausif");
		students.put(102, "Saif");
		students.put(103, "Khatija");
		students.put(104, "Nimra");
		System.out.println(students);
		System.out.println(students.getOrDefault(1011, "Key not present")); // It return value which we give if the key
																			// is not present.
		System.out.println(students);
		students.putIfAbsent(105, "Aman");
		System.out.println(students);
//		System.out.println(students.get(101));
//		System.out.println(students.get(1013)); // As key is not present it gives null.
		System.out.println(students.keySet());

		for (Integer i : students.keySet()) {
			System.out.println(i + " " + students.get(i));
		}

		System.out.println(students.values());
		System.out.println(students.containsKey(101));
		System.out.println(students.containsValue("Tausif"));
		
		
//		System.out.print("Enter a roll no: ");
//		int rollNo = sc.nextInt();
//		String name = students.get(rollNo);
//
//		if (name != null) {
//			System.out.println(name);
//		} else {
//			System.out.println("Invalid Roll no");
//		}

	}
}

//	Map - It is an Inteface,It is not the part of the collection hierarchy,It stores data in Key-Value Pairs.Searching is done on the basis of Key.Syntax of writing is Map<K,V>.Here K is Key and V is Value.Key should be Unique and value can be duplicates inside map.We get HashMap,LinkedHashMap,TreeMap in Map and all these are classes.
//	HashMap-Keys should be unique and can be null also,Values can be duplicates and whatever key-value pairs we are giving is not in a sequenece.
//	LinkedHashMap-Keys should be unique and can also be null,Values can be duplicates and pairs are in sequence.
//	TreeMap-Keys are unique and null values are not allowed,It sort data based on the data.