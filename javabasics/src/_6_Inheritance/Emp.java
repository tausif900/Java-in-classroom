package _6_Inheritance;

public class Emp {
	private Integer employeeId;
	private String employeeName;
	private Integer salary;
	private String department;

	public void displayManagerDetails() {
		System.out.println("Employee ID  " + this.employeeId);
		System.out.println("Employee Name  " + this.employeeName);
		System.out.println("Employee Salary  " + this.salary);
		System.out.println("Employee Department  " + this.department);
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Emp(Integer employeeId, String employeeName, Integer salary, String department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}

	public Emp() {
		super();

	}

}
