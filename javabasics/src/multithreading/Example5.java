package multithreading;

public class Example5 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {
			while (true) {
				System.out.println("Hello");
			}
		});
//	Demon thread provides service to other threads. Demon thread ki lifespan utna hi hota hai jitna main method ka lifespan.main method ke barabr demon thread alive rehta hai.Garbage collectors are nothing but a demon thread only that provides service to other thread.
		thread.setDaemon(true);
		thread.start();

		Thread.sleep(10000);
	}
}
