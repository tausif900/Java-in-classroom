package encapsulation;

public class Main {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setId(101);
		System.out.println(e1.getId()+10);
		
		e1.setName("Tausif");
		if (e1.getName() != null) {
			System.out.println(e1.getName()+" Hi");
		}
		e1.setSalary(25000);
		System.out.println(e1.getSalary());
	}
}
