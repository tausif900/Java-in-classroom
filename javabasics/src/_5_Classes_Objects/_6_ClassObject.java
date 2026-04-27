package _5_Classes_Objects;

// Class is a blueprint and Object is an instance or copies of that blueprint

class Student {
	int id;
	String name;
	int marks;
}

public class _6_ClassObject {
	public static void main(String[] args) {
// class_name object_name = new class_name();
		Student s1 = new Student();

//		Assigning value to object
		s1.id = 100;
		s1.name = "Tausif";
		s1.marks = 90;
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.marks);
	}
}
