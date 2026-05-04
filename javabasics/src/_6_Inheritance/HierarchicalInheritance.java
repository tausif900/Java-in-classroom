package _6_Inheritance;

public class HierarchicalInheritance {
	public static void main(String[] args) {

		FullTimeEmployee e1 = new FullTimeEmployee(101, "Tausif", "Oct-2024", 50000, "MD123", 6);
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.joiningDate);
		System.out.println(e1.salary);
		System.out.println(e1.mediclaimNo);
		System.out.println(e1.noOfLeaves);

		System.out.println();

		FreeLancer e2 = new FreeLancer(102, "Nitin", "Oct-24", 500);
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.joiningDate);
		System.out.println(e2.visitPay);

//		Manager obj using hybrid concept
		System.out.println();

		Manager m1 = new Manager(103, "Avinash", "oct-25", 25000, "MD234", 5);
		System.out.println(m1.id);
		System.out.println(m1.name);
		System.out.println(m1.joiningDate);
		System.out.println(m1.salary);
		System.out.println(m1.mediclaimNo);
		System.out.println(m1.noOfLeaves);
		
		m1.approveLeave();
	}
}

// Multiple Inheritance can't possible in Java through Classes but through Interfaces.........

// Hybrid Inheritance - combination of different  types of Inheritance