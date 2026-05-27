package multithreading;

public class Example4 {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("Thread 4"));
		thread.start();
	}
}
