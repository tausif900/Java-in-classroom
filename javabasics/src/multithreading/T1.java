package multithreading;

public class T1 extends Thread {
//	run method is always a task given to our method.
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//	Multithreading - Multiple processors comes and works at a same time.
//	Thread is a build-in Class.
//	steps - new Thread,Start() then ready to run i.e.runnable state,running then wait()or sleep() and after completion thread dead and then we cann't use that thread again once the work is done.