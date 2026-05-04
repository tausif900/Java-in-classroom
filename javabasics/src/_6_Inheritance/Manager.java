package _6_Inheritance;

public class Manager extends FullTimeEmployee {
	void approveLeave() {
		System.out.println("Leave Approved");
	}

	public Manager(int id, String name, String joiningDate, int salary, String mediclaimNo, int noOfLeaves) {
		super(id, name, joiningDate, salary, mediclaimNo, noOfLeaves);
	}
	
}
