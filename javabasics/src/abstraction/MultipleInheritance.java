package abstraction;

interface I1 {
	void method1();

	void display();
}

interface I2 {
	void method1();

	void method2();
}

class C implements I1, I2 {

//	Whenever we create object and calls a method, class calls it's own method not the interface class ka method, becuz it acts as a blueprint

	@Override
	public void method2() {
		System.out.println("Method 2 Called");
	}

	@Override
	public void method1() {
		System.out.println("Method 1 Called");
	}

	@Override
	public void display() {
		System.out.println("Display Called");
	}

}

public class MultipleInheritance {
//	we cann't achieve this using classes but using interfaces we can achieve
	public static void main(String[] args) {
		C c1 = new C();
		c1.method1();
	}
}
