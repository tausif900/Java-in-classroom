package staticExample;

public class Employee {
	int id;
	String name;
	static String managerName = "xyz";

	static void changeManagerName(String managerName) {
		Employee.managerName = managerName;
	}
}

//	Static belongs to the class
//	static methods calls with class name, when we call any method by it's class name it's called static method.