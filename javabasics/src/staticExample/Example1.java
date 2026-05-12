package staticExample;

public class Example1 {
//	static block, it is called always before the main method automatically
	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		Employee.changeManagerName("PQR");
		Employee employee1 = new Employee();
		employee1.id = 101;
	}
}
