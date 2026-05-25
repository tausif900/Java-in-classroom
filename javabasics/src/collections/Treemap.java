package collections;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		TreeMap<Integer, List<String>> batches = new TreeMap<Integer, List<String>>();
//	null key is  not allowed as sorting has to do here.
		batches.put(101, Arrays.asList("Tausif", "Saif", "Khatija", "Arman", "Khizer"));
		batches.put(102, Arrays.asList("Nisha", "Laik", "Zaid", "Arkum"));
		batches.put(103, Arrays.asList("Anisha", "Manisha", "Bhatya", "Desai"));

		for (Integer i : batches.keySet()) {
			System.out.println("Batch code:" + i);
//			int countStudents = 0;
			List<String> students = batches.get(i);
			for (String name : students) {
				System.out.println(name);
//				countStudents++;
			}
//			System.out.println("Number of Students in the batch are:" + countStudents);
			System.out.println("Total Number of Students:" + students.size());
			System.out.println("----------------");
		}
	}
}
