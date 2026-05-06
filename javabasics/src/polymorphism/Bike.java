package polymorphism;

public class Bike extends Vehicle {
	void start() {
//		parent ka bhi start method call hoga with the help of this super keyword
		super.start();
		System.out.println("Bike Started");
	}
}

