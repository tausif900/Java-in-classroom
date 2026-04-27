package _5_Classes_Objects;

class Patient {
	int id;
	String name;
	int age;
	int phoneNumber;

//	Non-Parameterised Constructor.
//	Constructor is also a function that is called automatically when the object is created.
	Patient() {
		System.out.println("Object is created");
	}

}

public class _7_ClsObj {
	public static void main(String[] args) {
		Patient p1 = new Patient();
//		Assigning the values
		p1.id = 101;
		p1.name = "Tausif";
		p1.age = 23;
		p1.phoneNumber = 900451023;
		System.out.println(p1.id);
		new Patient();
	}
}
