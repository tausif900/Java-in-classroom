package _5_Classes_Objects;


public class Stud {

	private Integer studentId;

	private String studentName;

	private Integer studentAge;

	private Integer studentMarks;

	private String studentDepartment;

	private static String collegeName = "Maharashtra College";

//	Method to display student details
	public void displayStudentDetails() {

		System.out.println("Student ID       : " + studentId);
		System.out.println("Student Name     : " + studentName);
		System.out.println("Student Age      : " + studentAge);
		System.out.println("Student Marks    : " + studentMarks);
		System.out.println("Department       : " + studentDepartment);
		System.out.println("College Name     : " + collegeName);

	}

//	Method to display Grade
	public String calculateGrade() {
		if (this.studentMarks >= 90) {
			System.out.println("Your Grade is A+");
		} else if (this.studentMarks >= 80 && this.studentMarks <= 89) {
			System.out.println("Your Grade is A");
		} else if (this.studentMarks >= 70 && this.studentMarks <= 79) {
			System.out.println("Your Grade is B");
		} else if (this.studentMarks >= 60 && this.studentMarks <= 69) {
			System.out.println("Your Grade is C");
		} else if (this.studentMarks >= 50 && this.studentMarks <= 59) {
			System.out.println("Your Grade is D");
		}
		return "Fail";
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public Integer getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(Integer studentMarks) {
		this.studentMarks = studentMarks;
	}

	public String getStudentDepartment() {
		return studentDepartment;
	}

	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Stud.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Stud [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentMarks=" + studentMarks + ", studentDepartment=" + studentDepartment + "]";
	}

	public Stud(Integer studentId, String studentName, Integer studentAge, Integer studentMarks,
			String studentDepartment) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
		this.studentDepartment = studentDepartment;
	}

	public Stud() {
		super();
	}

}
