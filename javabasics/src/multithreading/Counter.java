package multithreading;

public class Counter {

	int count = 0;

	synchronized public void increment() {
		count++;
	}
}
