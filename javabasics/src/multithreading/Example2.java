package multithreading;

public class Example2 {
	public static void main(String[] args) throws InterruptedException {
		T1 t1 = new T1();
//		start() method calls run()method internally.
		t1.start();

		T2 t2 = new T2();
		t2.start();

		t2.join();
		System.out.println("main");
	}
}
