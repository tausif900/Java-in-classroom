package _6_Inheritance;

public class FullTimeEmployee extends Employee {
	int salary;
	String mediclaimNo;
	int noOfLeaves;

	public FullTimeEmployee() {
		super();

	}

	public FullTimeEmployee(int id, String name, String joiningDate, int salary, String mediclaimNo, int noOfLeaves) {
		super(id, name, joiningDate);
		this.salary = salary;
		this.mediclaimNo = mediclaimNo;
		this.noOfLeaves = noOfLeaves;
	}

//	Object Creating

//	FullTimeEmployee FT1 = new FullTimeEmployee(101, "Tausif", "Jan-2026", 50000, "MD!@#", 6);
}

//super - parent ko  data pohchao..