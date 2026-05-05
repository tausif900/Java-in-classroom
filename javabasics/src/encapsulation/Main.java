package encapsulation;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(101);
		System.out.println(e1.getId());
		e1.setName("Tausif Ansari");
		if (e1.getName() != null) {
			System.out.println(e1.getName());
		}
		e1.setSalary(25000);
		System.out.println(e1.getSalary());
	}
}
