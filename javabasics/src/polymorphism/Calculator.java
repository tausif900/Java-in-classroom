package polymorphism;

public class Calculator {
	// Polymorphism - many forms of onething

	// method Overloading and method Overriding are two types of Polymorphism

	/*
	 * method Overloading - It happens within the one class, method name has to be
	 * same . we cann't reapeat same method and if we do,then type has to be
	 * different or then we have to give more parameter than previous one
	 * 
	 * method Overriding - it happens between 2 or more classes. when different
	 * class have same method name, same data type,same number of parameters
	 * ,even access modifier has to be same
	 * 
	 */

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(double a, int b) {
		System.out.println(a + b);
	}

	void add(int a, double b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
