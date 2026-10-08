package _6_Inheritance;

public class SeniorManager extends Man {

	private Integer projectCount;

	public void reviewProjects() {
		System.out.println("Senior Manager Reviews Project");
	}

	public Integer getProjectCount() {
		return projectCount;
	}

	public void setProjectCount(Integer projectCount) {
		this.projectCount = projectCount;
	}

	public SeniorManager(Integer projectCount) {
		super();
		this.projectCount = projectCount;
	}

	public SeniorManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeniorManager(Integer employeeId, String employeeName, Integer salary, String department, Integer teamSize) {
		super(employeeId, employeeName, salary, department, teamSize);
		// TODO Auto-generated constructor stub
	}

	public SeniorManager(Integer employeeId, String employeeName, Integer salary, String department) {
		super(employeeId, employeeName, salary, department);
		// TODO Auto-generated constructor stub
	}

}
