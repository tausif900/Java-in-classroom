package multithreading;

import java.util.LinkedList;
import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<String> patients = new LinkedList<String>();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter Patinet name");
				String patientName = input.next();

				System.out.println("Is it Emergency???");
				char isEmergency = input.next().charAt(0);

				if (isEmergency == 'y') {
					patients.addFirst(patientName);
				} else {
					patients.add(patientName);
				}
			}
//		System.out.println(patients);
		});
		t1.start();

		Thread t2 = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Patient Treated" + " " + patients.pollFirst());
			}
		});
		t2.start();

	}
}

//		one example program related to multithreading using collection concepts.
// 		Printer , bank balance , doctor application projects.
//											Step
//														
//		JDBC-java database connectivity.  connection url - jdbc:mysql://localhost:port_no/database-name.