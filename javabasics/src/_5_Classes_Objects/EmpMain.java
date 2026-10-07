package _5_Classes_Objects;

public class EmpMain {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Tausif", 25000, "CS");
		Employee emp2 = new Employee(102, "Saif");
		Employee emp3 = new Employee(103, "Khadija", 20000, "IT");

		emp1.displayEmpDetails();
		System.out.println("---------------------");
		emp2.displayEmpDetails();
		System.out.println("---------------------");
		emp3.displayEmpDetails();
		System.out.println("---------------------");
		emp1.setSalary(-30000);
		
		
	}
}
