package _6_Inheritance;

public class EmpManSingleInheritance {
	public static void main(String[] args) {
		Man manager = new Man();
		manager.setEmployeeName("Tausif");
		manager.setSalary(25000);
		System.out.println(manager.getEmployeeName());
		System.out.println(manager.getSalary());
		manager.setTeamSize(10);
		System.out.println(manager.getTeamSize());
		manager.manageTeam();

		Man manager2 = new Man(102, "Saif", 20000, "MVC", 20);
		manager2.displayManagerDetails();
		System.out.println(manager2.getTeamSize());
	}
}
