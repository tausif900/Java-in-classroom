package _5_Classes_Objects;

public class Employee {

	private Integer employeeId;
	private String employeeName;
	private Integer salary;
	private String department;

	public Employee(Integer employeeId, String employeeName, Integer salary, String department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}

	public Employee(Integer employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Employee() {
		super();
	}

//	Display Employees Details
	public void displayEmpDetails() {
		System.out.println("Employee ID       : " + employeeId);
		System.out.println("Employee Name     : " + employeeName);
		System.out.println("Employee Salary      : " + salary);
		System.out.println("Employee Department   : " + department);
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
		if (salary <= 0) {
			System.out.println("Salary cann't be negative");
		} else {
			this.salary = salary;
		}
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
