package generics;

@FunctionalInterface
interface I5 {
	void display();
}

@FunctionalInterface
interface I6 {
	void printNumber(int n);
}

@FunctionalInterface
interface I7 {
	void add(int a, int b);
}

public class Example5 {
	public static void main(String[] args) {
//	lambda expression 
		I5 obj = () -> System.out.println("Hello");
		obj.display();
		
		System.out.println("----------------------------------------");
		
		I6 obj1 = (n) -> System.out.println(n);
		obj1.printNumber(5);
		
		System.out.println("----------------------------------------");
		
		I6 obj2 = (n) -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n);
			}
		};
		obj2.printNumber(6);
		
		System.out.println("----------------------------------------");
		
		I6 obj3 = (n) -> {
			int table;
			for (int i = 1; i <= 10; i++) {
				table = n * i;
				System.out.println(table);
			}
		};
		obj3.printNumber(4);
		
		System.out.println("----------------------------------------");
		
		I7 obj4 = (a, b) ->  a + b;
		System.out.println(4,6);
	}
}
//lambda expression is the 
//lamdba sirf functional interface ke lie hi bnega.