package generics;

class A<T> {
	void details(T obj) {
		System.out.println(obj);
	}
}

// Here detail is customizing as the obj creator changing the type.

public class Example2 {
	public static void main(String[] args) {
		A<Integer> a = new A<Integer>();
		a.details(2);

		A<Double> b = new A<Double>();
		b.details(2.569);
	}
}
