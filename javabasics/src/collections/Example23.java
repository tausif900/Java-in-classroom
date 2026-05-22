package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example23 {
	public static void main(String[] args) {

//		Stream ApI-It is nothing but a pipeline of data,It doesn't store data but makes the copy,one stream can be used only once,because it goes from the pipline one by one.
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(90);
		list.add(45);

		Stream<Integer> stream = list.stream();
		stream.forEach((n) -> System.out.println(n));

//		method chaining
//		bana hua stream pe map method alag,then map ne again stream return kiya fr uspe for each laga bcuz ek stream ek hi bae use hoga.
		list.stream().map((n) -> n * n).forEach(n -> System.out.println(n));

		List<Integer> modulus = list.stream().map((n) -> n % 4).toList();
		System.out.println(modulus);

		System.out.println("---------------------------------------");
		List<String> students = Arrays.asList("Tausif", "Arman", "Sahil");

		students.stream().forEach((s) -> System.out.println(s + " " + s.length()));

		students.stream().filter((s) -> s.startsWith("A")).forEach((s) -> System.out.println(s));
	}
}
