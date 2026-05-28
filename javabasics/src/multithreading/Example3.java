package multithreading;

public class Example3 {
	public static void main(String[] args) {
		T3 t3 = new T3();
		Thread thread = new Thread(t3);
		thread.start();
	}
}
