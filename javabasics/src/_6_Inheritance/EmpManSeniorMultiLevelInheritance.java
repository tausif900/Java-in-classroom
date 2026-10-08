package _6_Inheritance;

public class EmpManSeniorMultiLevelInheritance {
	public static void main(String[] args) {
		SeniorManager sm1 = new SeniorManager();

		sm1.setEmployeeName("Khadija");
		sm1.setSalary(30000);
		System.out.println(sm1.getEmployeeName());
		System.out.println(sm1.getSalary());

		SeniorManager sm2 = new SeniorManager(103, "Aasif", 35000, "CS", 25);
		sm2.displayManagerDetails();
		System.out.println(sm2.getTeamSize());
		
		sm2.reviewProjects();
	}
}
