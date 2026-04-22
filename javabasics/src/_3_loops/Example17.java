package _3_loops;

public class Example17 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				continue;			// Aage ka program skip krdo
			System.out.println(i);
		}
	}
}
