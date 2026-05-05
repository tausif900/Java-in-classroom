package encapsulation;

public class Employee {

	/*
	 * Encapsulation - wrapping up data and code acting upon that data in a single
	 * unit, whatever instance variable we create that has to be private. we can
	 * apply validation also.
	 */

	private int id;
	private String name;
	private int salary;

	public void setId(int id) {
//		if id is greater than 0, then only usko set krdo variable id me , like this we apply validation.....
		if (id > 0) {
			this.id = id;
		}
	}

//	we r returning id here so developers can have control to do whatever with this id....
	public int getId() {
		return this.id;
	}

//	Setters are of void type
	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		} else
			System.out.println("Name is Empty");
	}

//	Getter are of return type which we want in return like int,float,String etc.....
	public String getName() {
		return this.name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
