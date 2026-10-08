package _6_Inheritance;

public class Man extends Emp {
	private Integer teamSize;

	public void manageTeam() {
		System.out.println("Manager managing team");
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public Man() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Man(Integer employeeId, String employeeName, Integer salary, String department) {
		super(employeeId, employeeName, salary, department);
		// TODO Auto-generated constructor stub
	}

	public Man(Integer employeeId, String employeeName, Integer salary, String department, Integer teamSize) {
		super(employeeId, employeeName, salary, department);
		this.teamSize = teamSize;
	}
	
	
	
}
