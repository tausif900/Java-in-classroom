package _5_Classes_Objects;

public class StudMain {
	public static void main(String[] args) {

		System.out.println("----Maharashtra College----");

		Stud s1 = new Stud(101, "Tausif", 23, 80, "CS");
		Stud s2 = new Stud(102, "Saif", 17, 60, "MVC");
		Stud s3 = new Stud(103, "Khadija", 18, 55, "IT");

		s1.displayStudentDetails();

		s3.calculateGrade();
	}
}
